package di

import data.KitsuApi
import data.trendinganime.AnimeRepository
import data.trendinganime.AnimeRepositoryImpl
import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import presentation.home.HomeScreenViewModel
import utils.Constants.BASE_URL
import utils.Constants.HEADER_TYPE

fun commonModule() = module {
    single {
        HttpClient(get()){
            defaultRequest {
                url {
                    host = BASE_URL
                    protocol = URLProtocol.HTTPS
                }
                headers {
                    append(HttpHeaders.ContentType, HEADER_TYPE)
                    append(HttpHeaders.Accept, HEADER_TYPE)
                }
            }

            install(Logging) {
                level = LogLevel.HEADERS
            }

            install(ContentNegotiation){
                json(
                    Json {
                        ignoreUnknownKeys = true
                        prettyPrint = true
                    }
                )
            }

            install(HttpTimeout) {
                requestTimeoutMillis = 20000L
                connectTimeoutMillis = 20000L
                socketTimeoutMillis = 20000L
            }
        }
    }

    single {
        KitsuApi(httpClient = get())
    }

    single<AnimeRepository> {AnimeRepositoryImpl(kitsuApi = get())}

    single{
        HomeScreenViewModel(animeRepository = get())
    }
}