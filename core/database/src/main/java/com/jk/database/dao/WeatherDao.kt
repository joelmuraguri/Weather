package com.jk.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.jk.database.entity.WeatherForecastEntity
import com.jk.database.relations.WeatherForeCastDetails
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {

    @Upsert
    suspend fun insertOrUpdateWeatherForecast(weatherForecast: WeatherForecastEntity)

    @Transaction
    @Query("SELECT * FROM Weather_Forecast_Table WHERE id = :forecastId")
    fun getWeatherForecastWithDetails(forecastId: Int): Flow<WeatherForeCastDetails>


}