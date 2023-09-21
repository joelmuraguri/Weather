package com.jk.database.forecast.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.jk.database.forecast.converters.IntListConverters

@Entity("Forecast")
data class ForecastEntity(
    @PrimaryKey val id : Int,
    @TypeConverters(IntListConverters::class)
    val temperature : List<Double>,
    @TypeConverters(IntListConverters::class)
    val temperatureMax : List<Double>,
    @TypeConverters(IntListConverters::class)
    val temperatureMin : List<Double>,
    val weather : String
)
