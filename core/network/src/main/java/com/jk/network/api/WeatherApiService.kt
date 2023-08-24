package com.jk.network.api

import com.jk.network.model.ForecastDataDTO
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.TimeZone

interface WeatherApiService {


    @GET("v1/forecast?hourly=temperature_2m,visibility,relativehumidity_2m,surface_pressure,windspeed_80m&current_weather=true&past_days=1&forecast_days=6&daily=temperature_2m_max,temperature_2m_min,uv_index_max")
    fun getWeatherForecast(
        @Query("longitude")longitude : Double,
        @Query("latitude")latitude : Double,
        @Query("timezone") timeZone : String = getDefaultTimeZone()
    ) : ForecastDataDTO


}

private fun getDefaultTimeZone() : String{
    val defaultTimeZone = TimeZone.getDefault()
    return defaultTimeZone.id
}