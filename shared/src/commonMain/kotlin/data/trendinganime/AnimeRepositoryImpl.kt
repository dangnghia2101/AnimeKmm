package data.trendinganime

import data.KitsuApi
import data.model.AnimeResponse
import domain.dto.DataDto
import domain.mappers.toDomain
import io.ktor.client.call.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import utils.NetworkResult
import utils.safeApiCall

class AnimeRepositoryImpl(
    private val kitsuApi: KitsuApi
): AnimeRepository {
    override suspend fun getTrendingAnime(): Flow<NetworkResult<List<DataDto>>> = flow {
        val response = safeApiCall {
            kitsuApi.getTrendingAnime().data?.map { it.toDomain() } ?: emptyList()
        }
        emit(response)
    }

    override suspend fun getUpcomingAnime(): Flow<NetworkResult<List<DataDto>>> = flow{
        val response = safeApiCall {
            kitsuApi.getUpcomingAnime().body<AnimeResponse>().data?.map { it.toDomain() } ?: emptyList()
        }
        emit(response)
    }
}