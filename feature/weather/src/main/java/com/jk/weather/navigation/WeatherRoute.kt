package com.jk.weather.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jk.weather.WeatherScreen

const val WEATHER_ROUTE = "weather_route"

fun NavGraphBuilder.weatherRoute(
    onNavToLocations : () -> Unit,
    onClickMoreOptions : () -> Unit
){


    composable(route = WEATHER_ROUTE){
        WeatherScreen(
            onNavToLocations = onNavToLocations,
            onClickMoreOptions = onClickMoreOptions
        )
    }

}