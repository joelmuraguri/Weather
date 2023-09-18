package com.jk.network.api

import com.jk.network.model.ForecastApiModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ForecastService {

    @GET("/v1/forecast")
    fun fetchForeCastResponse(
        @Query("latitude") latitude : Double,
        @Query("longitude") longitude : Double,
        @Query("forecast_days") days : Int = 7,
//        @Query("temperature_unit") unit : String,
        @Query("hourly") hourly : String = "temperature_2m",
        @Query("daily") daily : ArrayList<String> = arrayListOf("temperature_2m_max,temperature_2m_min")
    ) : ForecastApiModel
}