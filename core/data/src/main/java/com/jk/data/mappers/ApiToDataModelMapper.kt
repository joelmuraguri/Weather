package com.jk.data.mappers

import com.jk.data.model.DayForeCast
import com.jk.data.model.ForeCastDataModel
import com.jk.data.model.HourlyForeCast
import com.jk.data.model.LocationCoordinates
import com.jk.network.model.ForecastApiModel
import com.jk.network.model.WeatherApiModel

object ApiToDataModelMapper {

    fun WeatherApiModel.toData(forecastApiModel: ForecastApiModel, weatherApiModel: WeatherApiModel) : ForeCastDataModel{
        return ForeCastDataModel(
            cityName = weatherApiModel.name,
            temperature = weatherApiModel.main.temp,
            temperatureMax = weatherApiModel.main.tempMax,
            temperatureMin = weatherApiModel.main.tempMin,
            humidity = weatherApiModel.main.humidity,
            wind = weatherApiModel.wind.speed,
            visibility = weatherApiModel.visibility,
            airPressure = weatherApiModel.main.pressure,
            weatherIcon = weatherApiModel.weather.firstOrNull()?.icon.orEmpty(),
            weather = weatherApiModel.weather.firstOrNull()?.main.orEmpty(),
            cityId = weatherApiModel.id,
            coordinates = LocationCoordinates(
                latitude = weatherApiModel.coordinates.lat,
                longitude = weatherApiModel.coordinates.lon
            ),
            hourlyForeCast = forecastApiModel.hourly.toData(weatherApiModel.weather.firstOrNull()?.main.orEmpty()),
            dayForeCast = forecastApiModel.daily.toData(weatherApiModel.weather.firstOrNull()?.main.orEmpty()),
        )
    }

    fun ForecastApiModel.Daily.toData(weather : String) : DayForeCast {
       return DayForeCast(
           temperatureMax = temperature2mMax,
           temperatureMin = temperature2mMin,
           weather = weather
       )
    }

    fun ForecastApiModel.Hourly.toData(weather : String) : HourlyForeCast {
        return HourlyForeCast(
            weather = weather,
            temperature = temperature2m
        )
    }
}