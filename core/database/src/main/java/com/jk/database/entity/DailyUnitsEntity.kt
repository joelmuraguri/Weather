package com.jk.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Daily_Units_Table")
data class DailyUnitsEntity(
    @PrimaryKey val id: Int,
    val weatherForecastId: Int, // Foreign key referencing WeatherForecastEntity
    val temperature2mMax: String,
    val temperature2mMin: String,
    val time: String,
    val uvIndexMax: String
)
