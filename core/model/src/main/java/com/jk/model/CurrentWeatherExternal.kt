package com.jk.model

data class CurrentWeatherExternal(
    val isDay: Int,
    val temperature: Double,
    val time: String,
    val weatherCode: Int,
    val windDirection: Int,
    val windSpeed: Double
)