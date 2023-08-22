package com.jk.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.jk.database.entity.CurrentWeatherEntity
import com.jk.database.entity.DailyEntity
import com.jk.database.entity.DailyUnitsEntity
import com.jk.database.entity.HourlyEntity
import com.jk.database.entity.HourlyUnitsEntity
import com.jk.database.entity.WeatherForecastEntity

data class WeatherForeCastDetails(
    @Embedded val weatherForecastEntity: WeatherForecastEntity,
    @Relation(parentColumn = "id", entityColumn = "weatherForecastId")
    val currentWeather: CurrentWeatherEntity,
    @Relation(parentColumn = "id", entityColumn = "weatherForecastId")
    val dailyUnits: DailyUnitsEntity,
    @Relation(parentColumn = "id", entityColumn = "weatherForecastId")
    val daily: DailyEntity,
    @Relation(parentColumn = "id", entityColumn = "weatherForecastId")
    val hourlyUnits: HourlyUnitsEntity,
    @Relation(parentColumn = "id", entityColumn = "weatherForecastId")
    val hourly: HourlyEntity
)
