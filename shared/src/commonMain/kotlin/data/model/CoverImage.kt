package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoverImage(
    @SerialName("large")
    val large: String?,
    @SerialName("meta")
    val meta: data.model.Meta?,
    @SerialName("original")
    val original: String?,
    @SerialName("small")
    val small: String?,
    @SerialName("tiny")
    val tiny: String?,
)
