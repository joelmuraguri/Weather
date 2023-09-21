package com.jk.database.location.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jk.database.location.model.LocationEntity
import com.jk.database.weather.model.WeatherEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: LocationEntity)

    @Query("SELECT * FROM locations")
    fun getAll(): Flow<LocationEntity>
}