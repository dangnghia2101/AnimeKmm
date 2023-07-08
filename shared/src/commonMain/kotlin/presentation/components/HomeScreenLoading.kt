package presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import presentation.utlis.shimmer

@Composable
fun HomeScreenLoading() {
    Column(modifier = Modifier.padding(14.dp)) {
        Box(modifier = Modifier.height(20.dp).width(150.dp).clip(RoundedCornerShape(6.dp)).shimmer())

        Spacer(modifier = Modifier.height(20.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Box(
                modifier = Modifier.height(250.dp).width(150.dp).clip(RoundedCornerShape(6.dp))
                    .shimmer(),
            )

            Box(
                modifier = Modifier.height(250.dp).width(150.dp).clip(RoundedCornerShape(6.dp))
                    .shimmer(),
            )

            Box(
                modifier = Modifier.height(250.dp).width(150.dp).clip(RoundedCornerShape(6.dp))
                    .shimmer(),
            )

            Box(
                modifier = Modifier.height(250.dp).width(150.dp).clip(RoundedCornerShape(6.dp))
                    .shimmer(),
            )
        }
    }
}