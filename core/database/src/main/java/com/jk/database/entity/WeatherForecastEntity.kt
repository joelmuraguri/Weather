package com.jk.database.entity

import androidx.room.Entity

@Entity(tableName = "Weather_Forecast_Table")
data class WeatherForecastEntity(
    val id : Int,
    val elevation: Double,
    val generationTimeMs: Double,
    val hourly: HourlyEntity,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezoneAbbreviation: String,
    val utcOffsetSeconds: Int
)
