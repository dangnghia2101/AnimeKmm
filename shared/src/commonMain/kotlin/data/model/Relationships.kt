package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Relationships(
    @SerialName("animeCharacters")
    val animeCharacters: data.model.AnimeCharacters?,
    @SerialName("animeProductions")
    val animeProductions: data.model.AnimeProductions?,
    @SerialName("animeStaff")
    val animeStaff: data.model.AnimeStaff?,
    @SerialName("castings")
    val castings: data.model.Castings?,
    @SerialName("categories")
    val categories: data.model.Categories?,
    @SerialName("characters")
    val characters: data.model.Characters?,
    @SerialName("episodes")
    val episodes: data.model.Episodes?,
    @SerialName("genres")
    val genres: data.model.Genres?,
    @SerialName("installments")
    val installments: data.model.Installments?,
    @SerialName("mappings")
    val mappings: data.model.Mappings?,
    @SerialName("mediaRelationships")
    val mediaRelationships: data.model.MediaRelationships?,
    @SerialName("productions")
    val productions: data.model.Productions?,
    @SerialName("quotes")
    val quotes: data.model.Quotes?,
    @SerialName("reviews")
    val reviews: data.model.Reviews?,
    @SerialName("staff")
    val staff: data.model.Staff?,
    @SerialName("streamingLinks")
    val streamingLinks: data.model.StreamingLinks?,
)
