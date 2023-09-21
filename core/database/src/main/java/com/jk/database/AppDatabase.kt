package com.jk.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jk.database.forecast.converters.IntListConverters
import com.jk.database.forecast.dao.ForecastDao
import com.jk.database.forecast.model.ForecastEntity
import com.jk.database.location.dao.LocationDao
import com.jk.database.location.model.LocationEntity
import com.jk.database.weather.dao.WeatherDao
import com.jk.database.weather.model.WeatherEntity

@Database(
    entities = [WeatherEntity::class, ForecastEntity::class, LocationEntity::class ],
    version = 1
)
@TypeConverters(IntListConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun forecastDao() : ForecastDao
    abstract fun weatherDao() : WeatherDao
    abstract fun locationDao() : LocationDao
}