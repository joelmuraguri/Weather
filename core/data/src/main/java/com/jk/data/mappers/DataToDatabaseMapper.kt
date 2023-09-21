package com.jk.data.mappers

import com.jk.data.model.ForeCastDataModel
import com.jk.database.forecast.model.ForecastEntity
import com.jk.database.location.model.LocationEntity
import com.jk.database.weather.model.WeatherEntity


object DataToDatabaseMapper {


    fun ForeCastDataModel.toWeatherEntity() : WeatherEntity{
        return WeatherEntity(
            cityId = cityId,
            temperature = temperature,
            visibility = visibility,
            wind = wind,
            airPressure = airPressure,
            cityName = cityName,
            humidity = humidity,
            weather = weather,
            weatherIcon = weatherIcon,
            temperatureMax = temperatureMax,
            temperatureMin = temperatureMin
        )
    }


    fun ForeCastDataModel.toLocationEntity() : LocationEntity{
        return LocationEntity(
            cityId = cityId,
            cityName = cityName,
            longitude = coordinates.longitude,
            latitude = coordinates.latitude
        )
    }

    fun ForeCastDataModel.toForecastEntity() : ForecastEntity{
        return ForecastEntity(
            temperature = hourlyForeCast.temperature,
            temperatureMax = dayForeCast.temperatureMax,
            temperatureMin = dayForeCast.temperatureMin,
            id = cityId,
            weather = weather
        )
    }
}