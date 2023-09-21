package com.jk.database.weather.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Weather")
data class WeatherEntity(
    @PrimaryKey val cityId : Int,
    val temperature : Int,
    val temperatureMax : Double,
    val temperatureMin : Double,
    val visibility : Int,
    val wind : Double,
    val airPressure : Int,
    val cityName : String,
    val humidity : Int,
    val weather : String,
    val weatherIcon : String,
)
