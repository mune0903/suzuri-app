package com.mune0903.suzuri.data.model.items

import com.squareup.moshi.Json

data class PrintPlaceDisplayNames(
    val back: String?,
    val front: String?,
    @Json(name = "left-sleeve") val left_sleeve: String?,
    val outside: String?,
    @Json(name = "right-sleeve") val right_sleeve: String?
)