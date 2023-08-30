package com.jk.data.mappers

import com.jk.database.entity.CurrentWeatherEntity
import com.jk.database.entity.DailyEntity
import com.jk.database.entity.DailyUnitsEntity
import com.jk.database.entity.HourlyEntity
import com.jk.database.entity.HourlyUnitsEntity
import com.jk.database.entity.WeatherForecastEntity
import com.jk.database.relations.WeatherForeCastDetails
import com.jk.model.CurrentWeatherExternal
import com.jk.model.DailyExternal
import com.jk.model.DailyUnitsExternal
import com.jk.model.HourlyExternal
import com.jk.model.HourlyUnitsExternal
import com.jk.model.WeatherForeCast
import com.jk.model.WeatherForeCastDetailsExternal


fun WeatherForeCastDetails.asExternalModel() : WeatherForeCastDetailsExternal{
    return WeatherForeCastDetailsExternal(
        weatherForeCast = weatherForecastEntity.asExternal(),
        currentWeatherExternal = currentWeather.asExternal(),
        dailyUnitsExternal = dailyUnits.asExternal(),
        dailyExternal = daily.asExternal(),
        hourlyExternal = hourly.asExternal(),
        hourlyUnitsExternal = hourlyUnits.asExternal()
    )
}

fun WeatherForecastEntity.asExternal() : WeatherForeCast {
    return WeatherForeCast(
        elevation = elevation,
        generationTimeMs = generationTimeMs,
        hourlyExternal = hourly.asExternal(),
        hourlyUnitsExternal = hourlyUnitsEntity.asExternal(),
        dailyExternal = dailyEntity.asExternal(),
        dailyUnitsExternal = dailyUnitsEntity.asExternal(),
        latitude = latitude,
        longitude = longitude,
        timezone = timezone,
        timezoneAbbreviation = timezoneAbbreviation,
        utcOffsetSeconds = utcOffsetSeconds,
        currentWeatherExternal = currentWeatherEntity.asExternal()
    )
}

fun CurrentWeatherEntity.asExternal() : CurrentWeatherExternal{
    return CurrentWeatherExternal(
        isDay, temperature, time, weatherCode, windDirection, windSpeed
    )
}

fun DailyEntity.asExternal() : DailyExternal{
    return DailyExternal(
        temperature2mMax, temperature2mMin, time, uvIndexMax
    )
}

fun DailyUnitsEntity.asExternal() : DailyUnitsExternal{
    return DailyUnitsExternal(
        temperature2mMax, temperature2mMin, time, uvIndexMax
    )
}

fun HourlyEntity.asExternal() : HourlyExternal {
    return HourlyExternal(
        relativeHumidity2m, surfacePressure, temperature2m, time, visibility, windSpeed80m
    )
}

fun HourlyUnitsEntity.asExternal() : HourlyUnitsExternal{
    return HourlyUnitsExternal(
        relativeHumidity2m, surfacePressure, temperature2m, time, visibility, windSpeed80m
    )
}