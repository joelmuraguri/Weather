package com.jk.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Current_Weather_Table")
data class CurrentWeatherEntity(
    @PrimaryKey val id: Int,
    val weatherForecastId: Int,
    val isDay: Int,
    val temperature: Double,
    val time: String,
    val weatherCode: Int,
    val windDirection: Int,
    val windSpeed: Double
)
