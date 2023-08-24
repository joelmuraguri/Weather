package com.jk.database.datasource

import com.jk.database.dao.WeatherDao
import com.jk.database.entity.WeatherForecastEntity
import com.jk.database.relations.WeatherForeCastDetails
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FakeWeatherLocalDataSource @Inject constructor(
    private val dao : WeatherDao
) : WeatherLocalDataSource {

    override fun getWeatherForeCastDetails(foreCastId: Int): Flow<WeatherForeCastDetails> {
        return dao.getWeatherForecastWithDetails(foreCastId)
    }

    override suspend fun insertOrUpdateWeatherForeCast(weatherForecastEntity: WeatherForecastEntity) {
        return dao.insertOrUpdateWeatherForecast(weatherForecastEntity)
    }

}