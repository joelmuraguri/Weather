package com.jk.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastApiModel(
    val daily: Daily,
    @SerialName("daily_units")
    val dailyUnits: DailyUnits,
    val elevation: Int,
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
){
    @Serializable
    data class Daily(
        @SerialName("temperature_2m_max")
        val temperature2mMax: List<Double>,
        @SerialName("temperature_2m_min")
        val temperature2mMin: List<Double>,
        val time: List<String>
    )

    @Serializable
    data class DailyUnits(
        @SerialName("temperature_2m_max")
        val temperature2mMax: String,
        @SerialName("temperature_2m_min")
        val temperature2mMin: String,
        val time: String
    )

    @Serializable
    data class Hourly(
        @SerialName("temperature_2m")
        val temperature2m: List<Double>,
        val time: List<String>
    )

    @Serializable
    data class HourlyUnits(
        @SerialName("temperature_2m")
        val temperature2m: String,
        val time: String
    )
}