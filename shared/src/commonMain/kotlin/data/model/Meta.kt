package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Meta(
    @SerialName("dimensions")
    val dimensions: data.model.Dimensions?,
)
