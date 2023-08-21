package com.jk.locations.navigations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jk.locations.LocationsScreen

const val LOCATIONS_ROUTE = "locations_route"

fun NavGraphBuilder.locationsRoute(
    popBackStack : () -> Unit,
    onClickMoreOptions : () -> Unit
){

    composable(route = LOCATIONS_ROUTE){
        LocationsScreen(
            onClickMoreOptions = { onClickMoreOptions() },
            popBackStack
        )
    }

}