package com.mune0903.suzuri.data.model.items

data class Variant(
    val color: Color?,
    val enabled: Boolean?,
    val exemplary: Boolean?,
    val id: Int?,
    val price: Int?,
    val printPlaces: List<PrintPlace>?,
    val size: Size?
)