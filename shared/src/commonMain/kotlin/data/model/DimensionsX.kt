package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DimensionsX(
    @SerialName("large")
    val large: data.model.Large?,
    @SerialName("medium")
    val medium: data.model.Medium?,
    @SerialName("small")
    val small: data.model.Small?,
    @SerialName("tiny")
    val tiny: data.model.Tiny?,
)
