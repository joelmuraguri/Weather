package com.jk.network.model

data class Hourly(
    val relativehumidity_2m: List<Int>,
    val surface_pressure: List<Double>,
    val temperature_2m: List<Double>,
    val time: List<String>,
    val visibility: List<Double>,
    val windspeed_80m: List<Double>
)