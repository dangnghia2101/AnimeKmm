package presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import domain.dto.DataDto
import utils.AsyncImage

@Composable
fun AnimeComponent(
    dataDto: DataDto,
    navigateToAnimeDetailsScreen: (DataDto) -> Unit
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .shadow(
                spotColor = Color.LightGray,
                ambientColor = Color(0xFFdedede),
                elevation = 6.dp,
            )
            .height(320.dp)
            .padding(10.dp)
//            .clip(MaterialTheme.shapes.medium.copy(all = CornerSize(20.dp)))
    ) {
        if(dataDto?.attributes?.posterImage?.medium != null){
            Card (
                modifier = Modifier
                .height(250.dp)
                .width(150.dp)
                .padding(10.dp)
                .clickable {
                    navigateToAnimeDetailsScreen(dataDto)
                }

                )
            {
                AsyncImage(
                    imageUrl = dataDto.attributes.posterImage.medium ?: "",
                    contentDescription = "Anime",
                    contentScale = ContentScale.Crop,
                    loadingPlaceHolder = {},
                    modifier = Modifier.height(250.dp),
                    errorPlaceHolder = {},
                    alignment = Alignment.Center,
                    alpha = DefaultAlpha,
                    colorFilter = null,
                    filterQuality = DrawScope.DefaultFilterQuality
                )
            }
        }else {
            Card(
                modifier = Modifier.height(200.dp).width(120.dp),
                shape = RoundedCornerShape(15.dp),
                backgroundColor = Color.Black,
            ) {
            }
        }

        Text(
            text = dataDto.attributes?.canonicalTitle ?: "",
            textAlign = TextAlign.Start,
            softWrap = true,
            modifier = Modifier.width(100.dp),
            fontWeight = FontWeight.Medium
        )
    }
}
