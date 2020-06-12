package com.mune0903.suzuri.data.model.items

import com.squareup.moshi.Json

data class Anorak(
    @Json(name = "back-wearing") val back_wearing: String?,
    @Json(name = "front-wearing") val front_wearing: String?
)