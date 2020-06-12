package com.mune0903.suzuri.data.model.items

import com.squareup.moshi.Json

data class PrintPlaceForExtraAngles(
    val anorak: Anorak?,
    val koozie: Koozie?,
    @Json(name = "long-sleeve-t-shirt") val long_sleeve_t_shirt: LongSleeveTShirt?,
    @Json(name = "t-shirt") val t_shirt: TShirt?,
    @Json(name = "wash-t-shirt") val wash_t_shirt: WashTShirt?
)