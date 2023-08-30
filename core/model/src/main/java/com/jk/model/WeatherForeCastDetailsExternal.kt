package com.jk.model

data class WeatherForeCastDetailsExternal(
    val weatherForeCast : WeatherForeCast,
    val currentWeatherExternal: CurrentWeatherExternal,
    val dailyUnitsExternal: DailyUnitsExternal,
    val dailyExternal: DailyExternal,
    val hourlyExternal: HourlyExternal,
    val hourlyUnitsExternal: HourlyUnitsExternal
)