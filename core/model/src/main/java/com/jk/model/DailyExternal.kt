package com.jk.model

data class DailyExternal(
    val temperature2mMax: List<Double>,
    val temperature2mMin: List<Double>,
    val time: List<String>,
    val uvIndexMax: List<Double>
)