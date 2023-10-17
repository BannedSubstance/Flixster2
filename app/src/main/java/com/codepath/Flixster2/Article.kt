package com.codepath.`Flixster2`

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val docs: List<Article>?
)
@Keep
@Serializable
data class Article(
    @SerialName("overview")
    val abstract: String,
    @SerialName("release_date")
    val byline: String,
    @SerialName("vote_average")
    val vAverage: String,
    @SerialName("vote_count")
    val vCount: String,
    @SerialName("title")
    val headline: String,
    @SerialName("poster_path")
    val multimedia: String? = null
) : java.io.Serializable {
    val mediaImageUrl = "https://image.tmdb.org/t/p/w500/${multimedia}"
}
@Keep
@Serializable
data class HeadLine(
    @SerialName("main")
    val main: String
) : java.io.Serializable
@Keep
@Serializable
data class Byline(
    @SerialName("release_date")
    val original: String? = null
) : java.io.Serializable
@Keep
@Serializable
data class MultiMedia(
    @SerialName("poster_path")
    val url: String?
) : java.io.Serializable