package com.jk.database.weather.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jk.database.weather.model.WeatherEntity
import kotlinx.coroutines.flow.Flow

interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: WeatherEntity)

    @Query("SELECT * FROM weather")
    fun getAll(): Flow<WeatherEntity>
}