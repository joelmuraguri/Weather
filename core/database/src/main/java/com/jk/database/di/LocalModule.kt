package com.jk.database.di

import android.content.Context
import androidx.room.Room
import com.jk.database.WeatherDatabase
import com.jk.database.dao.WeatherDao
import com.jk.database.datasource.FakeWeatherLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {


    @Provides
    @Singleton
    fun providesWeatherDatabase(
        @ApplicationContext context : Context
    ) : WeatherDatabase{
        return Room.databaseBuilder(
            context,
            WeatherDatabase::class.java,
            "Weather_Database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providesLocalDataSource(db : WeatherDatabase) : FakeWeatherLocalDataSource{
        return FakeWeatherLocalDataSource(db.weatherDao())
    }



}