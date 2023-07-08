package presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import presentation.AnimeComponent
import presentation.components.HomeScreenLoading
import presentation.detail.AnimeDetailsScreen

internal class HomeScreen: Screen, KoinComponent{

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val homeScreenViewModel: HomeScreenViewModel by inject()
        val homeScreenUiState = homeScreenViewModel.state.collectAsState()

        Box(modifier = Modifier.fillMaxSize()){
            LazyColumn (
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ){
                item {
                    if(homeScreenUiState.value.loadingTrendingAnime){
                        HomeScreenLoading()
                    }

                    if(!homeScreenUiState.value.loadingTrendingAnime){
                        Column {
                            Text(
                                "\uD83D\uDD25 Trending Anime",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            LazyRow (horizontalArrangement = Arrangement.spacedBy(10.dp)){
                                items(homeScreenUiState.value.trendingAnime){trendingAnime ->
                                    AnimeComponent(
                                        dataDto = trendingAnime,
                                        navigateToAnimeDetailsScreen = {
                                            navigator.push(AnimeDetailsScreen(dataDto = it))
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Text(text="nghia",  modifier = Modifier.align(
                Alignment.Center,
            ))
        }
    }
}