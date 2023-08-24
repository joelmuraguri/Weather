package com.jk.network.datasource

import com.jk.network.api.WeatherApiService
import com.jk.network.model.ForecastDataDTO
import javax.inject.Inject

class FakeWeatherRemoteSource @Inject constructor(
    private val apiService: WeatherApiService
) : WeatherRemoteSource {

    override suspend fun getWeatherForecast(
        longitude : Double,
        latitude : Double
    ): ForecastDataDTO {
        return apiService.getWeatherForecast(longitude, latitude)
    }

}