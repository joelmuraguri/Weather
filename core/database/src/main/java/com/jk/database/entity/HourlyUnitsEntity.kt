package com.jk.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Hourly_Units_Table")
data class HourlyUnitsEntity(
    @PrimaryKey val id: Int ? = null,
    val weatherForecastId: Int ? = null,
    val relativeHumidity2m: String,
    val surfacePressure: String,
    val temperature2m: String,
    val time: String,
    val visibility: String,
    val windSpeed80m: String
)
