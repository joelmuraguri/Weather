package com.jk.data.mappers

import com.jk.data.model.DayForeCast
import com.jk.data.model.ForeCastDataModel
import com.jk.data.model.HourlyForeCast
import com.jk.data.model.LocationCoordinates
import com.jk.database.forecast.model.ForecastEntity
import com.jk.database.location.model.LocationEntity
import com.jk.database.weather.model.WeatherEntity

object DatabaseToDataModelMappers {

    fun toData(
        weatherEntity: WeatherEntity, forecastEntity: ForecastEntity, locationEntity: LocationEntity
    ) : ForeCastDataModel{
        return ForeCastDataModel(
            cityId = locationEntity.cityId,
            cityName = locationEntity.cityName,
            temperatureMin = weatherEntity.temperatureMin,
            temperatureMax = weatherEntity.temperatureMax,
            humidity = weatherEntity.humidity,
            wind = weatherEntity.wind,
            airPressure = weatherEntity.airPressure,
            visibility = weatherEntity.visibility,
            weather = weatherEntity.weather,
            weatherIcon = weatherEntity.weatherIcon,
            hourlyForeCast = forecastEntity.toHourlyForecastData(),
            dayForeCast = forecastEntity.toDailyForecastData(),
            coordinates = LocationCoordinates(
                latitude = locationEntity.latitude,
                longitude = locationEntity.longitude
            ),
            temperature = weatherEntity.temperature
        )
    }

    fun ForecastEntity.toDailyForecastData() : DayForeCast{
        return DayForeCast(
            weather = weather,
            temperatureMax = temperatureMax,
            temperatureMin = temperatureMin
        )
    }

    fun ForecastEntity.toHourlyForecastData() : HourlyForeCast{
        return HourlyForeCast(
            weather = weather,
            temperature = temperature
        )
    }
}