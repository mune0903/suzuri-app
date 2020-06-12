package com.mune0903.suzuri.data.model.items

import com.squareup.moshi.Json

data class Koozie(
    @Json(name = "front-holding") val front_holding: String?
)