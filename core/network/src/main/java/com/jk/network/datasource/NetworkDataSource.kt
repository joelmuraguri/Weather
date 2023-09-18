package com.jk.network.datasource

import com.jk.network.model.ForecastApiModel
import com.jk.network.model.GeocodingApiModel
import com.jk.network.model.LocationModel
import com.jk.network.model.WeatherApiModel

interface NetworkDataSource {

    suspend fun fetchWeatherInfo(
        locationModel: LocationModel,
    ) : WeatherApiModel

    suspend fun fetchCities(
        query : String,
    ) : GeocodingApiModel

    suspend fun fetchForeCastInfo(
        locationModel: LocationModel,
    ) : ForecastApiModel

}