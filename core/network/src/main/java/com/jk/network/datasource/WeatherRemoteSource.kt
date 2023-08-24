package com.jk.network.datasource

import com.jk.network.model.ForecastDataDTO

interface WeatherRemoteSource {

    suspend fun getWeatherForecast(longitude : Double, latitude : Double) : ForecastDataDTO
}