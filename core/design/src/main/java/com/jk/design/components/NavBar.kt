package com.jk.design.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.jk.design.WeatherIcons
import com.jk.design.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherNavBar(
    onNavToLocations : () -> Unit,
    onClickMoreOptions : () -> Unit
){

    TopAppBar(
        title = { /*TODO*/ },
        actions = {

            IconButton(onClick = { onNavToLocations() }) {
                Icon(
                    painter = painterResource(id = WeatherIcons.addLocations),
                    contentDescription = stringResource(id = R.string.add_location_icon_description)
                )
            }

            WeatherDropDownMenu(
                title = R.string.settings_title) {
                onClickMoreOptions()
            }

        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationsNavBar(
    onClickMoreOptions : () -> Unit,
    popBackStack : () -> Unit
){

    TopAppBar(
        title = {
            Text(
                stringResource(id = R.string.manage_cities_title))
        },
        actions = {
            WeatherDropDownMenu(
                title = R.string.edit_title) {
                onClickMoreOptions()
            }
        },
        navigationIcon = {
            IconButton(onClick = { popBackStack() }) {
                Icon(
                    painter = painterResource(id = WeatherIcons.arrowBack),
                    contentDescription = stringResource(id = R.string.arrow_back_icon_description))
            }
        }
    )
}

