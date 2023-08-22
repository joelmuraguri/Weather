package com.jk.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDataDTO(
    @SerialName("current_weather")
    val currentWeather: CurrentWeather,
    val daily: Daily,
    @SerialName("daily_units")
    val dailyUnits: DailyUnits,
    val elevation: Double,
    @SerialName("generationtime_ms")
    val generationTimeMs: Double,
    val hourly: Hourly,
    @SerialName("hourly_units")
    val hourlyUnits: HourlyUnits,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    @SerialName("timezone_abbreviation")
    val timezoneAbbreviation: String,
    @SerialName("utc_offset_seconds")
    val utcOffsetSeconds: Int
)