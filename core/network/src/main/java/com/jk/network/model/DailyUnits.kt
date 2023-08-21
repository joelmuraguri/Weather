package com.jk.network.model

data class DailyUnits(
    val temperature_2m_max: String,
    val temperature_2m_min: String,
    val time: String,
    val uv_index_max: String
)