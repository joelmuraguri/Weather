package com.jk.weather.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jk.locations.navigations.LOCATIONS_ROUTE
import com.jk.locations.navigations.locationsRoute
import com.jk.settings.navigation.SETTINGS_ROUTE
import com.jk.settings.navigation.settingsRoute

@Composable
fun WeatherNavGraph(){


    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = WEATHER_ROUTE){
        weatherRoute(
            onNavToLocations = {
                navController.navigate(LOCATIONS_ROUTE)
            },
            onClickMoreOptions = {
                navController.navigate(SETTINGS_ROUTE)
            }
        )

        locationsRoute(
            popBackStack = {
                navController.popBackStack()
            },
            onClickMoreOptions = {

            }
        )
        settingsRoute()

    }

}