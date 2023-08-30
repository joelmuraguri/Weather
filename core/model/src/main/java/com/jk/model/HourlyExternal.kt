package com.jk.model

data class HourlyExternal(
    val relativeHumidity2m: List<Int>,
    val surfacePressure: List<Double>,
    val temperature2m: List<Double>,
    val time: List<String>,
    val visibility: List<Double>,
    val windSpeed80m: List<Double>
)