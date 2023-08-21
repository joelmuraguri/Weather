package com.jk.weather

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.jk.design.components.WeatherNavBar

@Composable
fun WeatherScreen(
    onNavToLocations : () -> Unit,
    onClickMoreOptions : () -> Unit
){

    Scaffold(
        topBar = {
            WeatherNavBar(
                onNavToLocations = { onNavToLocations() },
                onClickMoreOptions = onClickMoreOptions
            )
        }
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(
                "Weather",
                fontSize = 25.sp
            )
        }
    }


}