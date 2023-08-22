package com.jk.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyUnits(
    @SerialName("relativehumidity_2m")
    val relativehumidity2m: String,
    @SerialName("surface_pressure")
    val surfacePressure: String,
    @SerialName("temperature_2m")
    val temperature2m: String,
    val time: String,
    val visibility: String,
    @SerialName("windspeed_80m")
    val windSpeed80m: String
)