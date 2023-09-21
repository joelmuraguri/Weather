package com.jk.data.model

data class ForeCastDataModel(
    val cityName : String,
    val temperature : Int,
    val temperatureMax : Double,
    val temperatureMin : Double,
    val humidity : Int,
    val wind : Double,
    val visibility : Int,
    val airPressure : Int,
    val weatherIcon : String,
    val weather : String,
    val coordinates: LocationCoordinates,
    val hourlyForeCast: HourlyForeCast,
    val dayForeCast: DayForeCast,
    val cityId: Int

)
