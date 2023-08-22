package com.jk.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyUnits(
    @SerialName("temperature_2m_max")
    val temperature2mMax: String,
    @SerialName("temperature_2m_min")
    val temperature2mMin: String,
    val time: String,
    @SerialName("uv_index_max")
    val uvIndexMax: String
)