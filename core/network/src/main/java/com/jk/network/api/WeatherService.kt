package com.jk.network.api

import com.jk.network.model.GeocodingApiModel
import com.jk.network.model.WeatherApiModel
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("data/2.5/weather")
    fun fetchCurrentWeather(
        @Query("lat") latitude : Double,
        @Query("lon") longitude : Double,
        @Query("appid") apiKey : String
    ) : WeatherApiModel

    @GET("geo/1.0/direct")
    fun searchCities(
        @Query("q") query: String,
        @Query("appid") apiKey : String
    ) : GeocodingApiModel


}