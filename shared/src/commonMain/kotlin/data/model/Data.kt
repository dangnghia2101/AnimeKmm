package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("attributes")
    val attributes: data.model.Attributes?,
    @SerialName("id")
    val id: String?,
    @SerialName("links")
    val links: data.model.Links?,
    @SerialName("relationships")
    val relationships: data.model.Relationships?,
    @SerialName("type")
    val type: String?,
)
