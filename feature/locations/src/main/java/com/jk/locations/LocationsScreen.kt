package com.jk.locations

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.jk.design.components.LocationsNavBar

@Composable
fun LocationsScreen(
    onClickMoreOptions : () -> Unit,
    popBackStack : () -> Unit
){

    Scaffold(
        topBar = {
            LocationsNavBar(
                onClickMoreOptions, popBackStack
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
                "Manage Cities",
                fontSize = 25.sp
            )
        }
    }

}