package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Large(
    @SerialName("height")
    val height: Int?,
    @SerialName("width")
    val width: Int?,
)
