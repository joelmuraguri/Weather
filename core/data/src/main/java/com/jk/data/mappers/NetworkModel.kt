package com.jk.data.mappers

import com.jk.database.entity.CurrentWeatherEntity
import com.jk.database.entity.DailyEntity
import com.jk.database.entity.DailyUnitsEntity
import com.jk.database.entity.HourlyEntity
import com.jk.database.entity.HourlyUnitsEntity
import com.jk.database.entity.WeatherForecastEntity
import com.jk.network.model.CurrentWeather
import com.jk.network.model.Daily
import com.jk.network.model.DailyUnits
import com.jk.network.model.ForecastDataDTO
import com.jk.network.model.Hourly
import com.jk.network.model.HourlyUnits


fun ForecastDataDTO.asEntity() : WeatherForecastEntity{
    return WeatherForecastEntity(
        elevation = elevation,
        generationTimeMs = generationTimeMs,
        hourly = hourly.asEntity(),
        latitude = latitude,
        longitude = longitude,
        timezone = timezone,
        timezoneAbbreviation = timezoneAbbreviation,
        utcOffsetSeconds = utcOffsetSeconds,
        dailyEntity = daily.asEntity(),
        dailyUnitsEntity = dailyUnits.asEntity(),
        hourlyUnitsEntity = hourlyUnits.asEntity(),
        currentWeatherEntity = currentWeather.asEntity()
    )
}

fun Daily.asEntity() : DailyEntity{
    return DailyEntity(
        temperature2mMax = temperature2mMax,
        temperature2mMin = temperature2mMin,
        time = time,
        uvIndexMax = uvIndexMax
    )
}

fun DailyUnits.asEntity() : DailyUnitsEntity{
    return DailyUnitsEntity(
        temperature2mMax = temperature2mMax,
        temperature2mMin = temperature2mMin,
        time = time,
        uvIndexMax = uvIndexMax
    )
}

fun CurrentWeather.asEntity() : CurrentWeatherEntity{
    return CurrentWeatherEntity(
        isDay = isDay,
        temperature = temperature,
        time = time,
        weatherCode = weatherCode,
        windDirection = windDirection,
        windSpeed = windSpeed
    )
}

fun Hourly.asEntity() : HourlyEntity{
    return HourlyEntity(
        relativeHumidity2m = relativeHumidity2m,
        surfacePressure = surfacePressure,
        temperature2m = temperature2m,
        time = time,
        visibility = visibility,
        windSpeed80m = windSpeed80m
    )
}

fun HourlyUnits.asEntity() : HourlyUnitsEntity{
    return HourlyUnitsEntity(
        surfacePressure = surfacePressure,
        temperature2m = temperature2m,
        time = time,
        visibility = visibility,
        windSpeed80m = windSpeed80m,
        relativeHumidity2m = relativehumidity2m
    )
}