package com.jk.design.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jk.design.WeatherIcons
import com.jk.design.R

@Composable
fun WeatherDropDownMenu(
    @StringRes title : Int,
    onActionClick : () -> Unit
){

    var expanded by remember { mutableStateOf(false) }


    Box(
        contentAlignment = Alignment.Center
    ){
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = WeatherIcons.moreOptions),
                contentDescription = stringResource(id = R.string.more_options_icon_description))
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier)
        {
            DropdownMenuItem(
                text = {
                       Text(text = stringResource(id = title))
                },
                onClick = { onActionClick() }
            )
        }
    }
}