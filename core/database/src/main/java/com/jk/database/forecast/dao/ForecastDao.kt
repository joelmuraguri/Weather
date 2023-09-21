package com.jk.database.forecast.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jk.database.forecast.model.ForecastEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ForecastDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: ForecastEntity)

    @Query("SELECT * FROM forecast")
    fun getAll(): Flow<ForecastEntity>
}

