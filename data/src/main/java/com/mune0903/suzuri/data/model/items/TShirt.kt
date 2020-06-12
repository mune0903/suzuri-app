package com.mune0903.suzuri.data.model.items

import com.squareup.moshi.Json

data class TShirt(
    @Json(name = "front-wearing-ladies") val front_wearing_ladies: String?,
    @Json(name = "front-wearing-mens") val front_wearing_mens: String?
)