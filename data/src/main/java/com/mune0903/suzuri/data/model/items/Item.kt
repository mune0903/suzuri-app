package com.mune0903.suzuri.data.model.items

data class Item(
    val angles: List<String>?,
    val availablePrintPlaces: List<String>?,
    val defaultPrintPlace: String?,
    val displayOrder: Int?,
    val essentialAngles: List<String>?,
    val extraAngles: List<String>?,
    val humanizeName: String?,
    val iconUrls: IconUrls?,
    val id: Int?,
    val isMultiPrintable: Boolean?,
    val name: String?,
    val printPlaceDisplayNames: PrintPlaceDisplayNames?,
    val printPlaceForExtraAngles: PrintPlaceForExtraAngles?,
    val productImageUrlTemplates: ProductImageUrlTemplates?,
    val variants: List<Variant>?
)