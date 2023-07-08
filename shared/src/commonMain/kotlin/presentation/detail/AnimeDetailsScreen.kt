package presentation.detail

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import domain.dto.DataDto
import org.koin.core.component.KoinComponent

internal class AnimeDetailsScreen(
    private val dataDto: DataDto
): Screen, KoinComponent{

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow


    }
}