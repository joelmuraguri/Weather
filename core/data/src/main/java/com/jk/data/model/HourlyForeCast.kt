package com.jk.data.model

data class HourlyForeCast(
    val weather : String ? = null,
    val temperature : List<Double>,
)
