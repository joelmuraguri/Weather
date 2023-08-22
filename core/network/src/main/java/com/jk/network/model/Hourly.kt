package com.jk.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hourly(
    @SerialName("relativehumidity_2m")
    val relativeHumidity2m: List<Int>,
    @SerialName("surface_pressure")
    val surfacePressure: List<Double>,
    @SerialName("temperature_2m")
    val temperature2m: List<Double>,
    val time: List<String>,
    val visibility: List<Double>,
    @SerialName("windspeed_80m")
    val windSpeed80m: List<Double>
)