package com.jk.network.model

import kotlinx.serialization.Serializable

@Serializable
data class GeocodingApiModel(
    val city :  List<GeocodingApiModelItem>
) {

    @Serializable
    data class GeocodingApiModelItem(
        val country: String,
        val lat: Double,
        val local_names: LocalNames,
        val lon: Double,
        val name: String,
        val state: String
    )

    @Serializable
    data class LocalNames(
        val am: String,
        val ar: String,
        val az: String,
        val be: String,
        val bg: String,
        val bn: String,
        val bo: String,
        val cs: String,
        val de: String,
        val el: String,
        val en: String,
        val eo: String,
        val es: String,
        val fa: String,
        val fr: String,
        val fy: String,
        val he: String,
        val hi: String,
        val ht: String,
        val hu: String,
        val hy: String,
        val `is`: String,
        val `it`: String,
        val ja: String,
        val ka: String,
        val kk: String,
        val kn: String,
        val ko: String,
        val ku: String,
        val ky: String,
        val la: String,
        val lt: String,
        val mk: String,
        val ml: String,
        val mn: String,
        val mr: String,
        val my: String,
        val nl: String,
        val no: String,
        val oc: String,
        val os: String,
        val pl: String,
        val pt: String,
        val ru: String,
        val sk: String,
        val so: String,
        val sr: String,
        val sv: String,
        val ta: String,
        val tg: String,
        val th: String,
        val tk: String,
        val tr: String,
        val tt: String,
        val ug: String,
        val uk: String,
        val ur: String,
        val yi: String,
        val zh: String
    )
}