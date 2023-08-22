package com.jk.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.jk.database.converters.DoubleListConverter
import com.jk.database.converters.StringListConverter

@Entity(tableName = "Daily_Table")
data class DailyEntity(
    @PrimaryKey val id: Int,
    val weatherForecastId: Int, // Foreign key referencing WeatherForecastEntity
    @TypeConverters(DoubleListConverter::class)
    val temperature2mMax: List<Double>,
    @TypeConverters(DoubleListConverter::class)
    val temperature2mMin: List<Double>,
    @TypeConverters(StringListConverter::class)
    val time: List<String>,
    @TypeConverters(DoubleListConverter::class)
    val uvIndexMax: List<Double>
)