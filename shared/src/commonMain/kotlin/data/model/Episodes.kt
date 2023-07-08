package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Episodes(
    @SerialName("links")
    val links: data.model.LinksX?,
)
