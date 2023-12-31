package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PosterImage(
    @SerialName("large")
    val large: String?,
    @SerialName("medium")
    val medium: String?,
    @SerialName("meta")
    val meta: data.model.MetaX?,
    @SerialName("original")
    val original: String?,
    @SerialName("small")
    val small: String?,
    @SerialName("tiny")
    val tiny: String?,
)
