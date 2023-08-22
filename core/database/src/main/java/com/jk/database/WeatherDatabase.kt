package com.jk.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jk.database.converters.DoubleListConverter
import com.jk.database.converters.IntListConverters
import com.jk.database.converters.StringListConverter
import com.jk.database.dao.WeatherDao
import com.jk.database.entity.CurrentWeatherEntity
import com.jk.database.entity.DailyEntity
import com.jk.database.entity.DailyUnitsEntity
import com.jk.database.entity.HourlyEntity
import com.jk.database.entity.HourlyUnitsEntity
import com.jk.database.entity.WeatherForecastEntity

@Database(
    entities = [
        WeatherForecastEntity::class,
        CurrentWeatherEntity::class,
        DailyUnitsEntity::class,
        DailyEntity::class,
        HourlyUnitsEntity::class,
        HourlyEntity::class ],
    version = 1
)
@TypeConverters(IntListConverters::class, DoubleListConverter::class, StringListConverter::class)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun weatherDao() : WeatherDao

}