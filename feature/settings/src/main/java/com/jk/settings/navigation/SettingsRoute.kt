package com.jk.settings.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jk.settings.SettingsScreen

const val SETTINGS_ROUTE = "settings_route"

fun NavGraphBuilder.settingsRoute(){

    composable(route = SETTINGS_ROUTE){
        SettingsScreen()
    }

}