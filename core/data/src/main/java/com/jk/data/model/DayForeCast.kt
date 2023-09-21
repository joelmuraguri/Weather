package com.jk.data.model

data class DayForeCast(
    val weather : String,
    val temperatureMax : List<Double>,
    val temperatureMin : List<Double>,
)
