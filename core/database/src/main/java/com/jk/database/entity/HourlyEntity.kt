package com.jk.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.jk.database.converters.DoubleListConverter
import com.jk.database.converters.IntListConverters
import com.jk.database.converters.StringListConverter

@Entity(tableName = "Hourly_Table")
data class HourlyEntity(
    @PrimaryKey val id: Int,
    val weatherForecastId: Int,
    @TypeConverters(IntListConverters::class)
    val relativeHumidity2m: List<Int>,
    @TypeConverters(DoubleListConverter::class)
    val surfacePressure: List<Double>,
    @TypeConverters(DoubleListConverter::class)
    val temperature2m: List<Double>,
    @TypeConverters(StringListConverter::class)
    val time: List<String>,
    @TypeConverters(DoubleListConverter::class)
    val visibility: List<Double>,
    @TypeConverters(DoubleListConverter::class)
    val windSpeed80m: List<Double>
)
