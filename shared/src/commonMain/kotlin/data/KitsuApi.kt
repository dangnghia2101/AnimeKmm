package data

import data.model.AnimeResponse
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import utils.Constants

class KitsuApi (
    private val httpClient: HttpClient
) {
    suspend fun getTrendingAnime(): AnimeResponse {
        return httpClient.get(urlString = Constants.TRENDING_ANIME).bodyAsText().let {
            json -> Json.decodeFromString(json)
        }
    }

    suspend fun getUpcomingAnime(): HttpResponse {
        return httpClient.get {
            url(Constants.UPCOMING_ANIME)
            parameter("status", "upcoming")
        }
    }
}