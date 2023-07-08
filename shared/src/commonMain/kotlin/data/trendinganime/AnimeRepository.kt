package data.trendinganime

import domain.dto.DataDto
import kotlinx.coroutines.flow.Flow
import utils.NetworkResult

interface AnimeRepository {
    suspend fun getTrendingAnime(): Flow<NetworkResult<List<DataDto>>>

    suspend fun getUpcomingAnime(): Flow<NetworkResult<List<DataDto>>>
}