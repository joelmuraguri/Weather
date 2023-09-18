package com.jk.network.datasource

import com.jk.network.api.ForecastService
import com.jk.network.api.WeatherService
import com.jk.network.model.ForecastApiModel
import com.jk.network.model.GeocodingApiModel
import com.jk.network.model.LocationModel
import com.jk.network.model.WeatherApiModel
import javax.inject.Inject

class NetworkDataSourceImpl @Inject constructor(
    private val weatherService: WeatherService,
    private val forecastService: ForecastService,
    private val apiKey : String
): NetworkDataSource {

    override suspend fun fetchWeatherInfo(locationModel: LocationModel): WeatherApiModel {
        return weatherService.fetchCurrentWeather(
            latitude = locationModel.latitude,
            longitude = locationModel.longitude,
            apiKey = apiKey
        )
    }

    override suspend fun fetchCities(query: String): GeocodingApiModel {
        return weatherService.searchCities(
            query = query,
            apiKey = apiKey
        )
    }

    override suspend fun fetchForeCastInfo(locationModel: LocationModel): ForecastApiModel {
        return forecastService.fetchForeCastResponse(
            latitude = locationModel.latitude,
            longitude = locationModel.longitude
        )
    }

}