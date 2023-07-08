package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeStaff(
    @SerialName("links")
    val links: data.model.LinksX?,
)
