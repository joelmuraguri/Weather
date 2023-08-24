package com.jk.database.datasource

import com.jk.database.entity.WeatherForecastEntity
import com.jk.database.relations.WeatherForeCastDetails
import kotlinx.coroutines.flow.Flow

interface WeatherLocalDataSource {

    fun getWeatherForeCastDetails(foreCastId : Int) : Flow<WeatherForeCastDetails>

    suspend fun insertOrUpdateWeatherForeCast(weatherForecastEntity: WeatherForecastEntity)

}