package com.jk.model

data class WeatherForeCast(
    val elevation: Double,
    val generationTimeMs: Double,
    val hourlyExternal : HourlyExternal,
    val hourlyUnitsExternal: HourlyUnitsExternal,
    val currentWeatherExternal: CurrentWeatherExternal,
    val dailyExternal: DailyExternal,
    val dailyUnitsExternal: DailyUnitsExternal,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezoneAbbreviation: String,
    val utcOffsetSeconds: Int
)
