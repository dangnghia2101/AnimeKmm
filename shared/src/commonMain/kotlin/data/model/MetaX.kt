package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetaX(
    @SerialName("dimensions")
    val dimensions: data.model.DimensionsX?,
)
