package com.jk.database.forecast.converters

import androidx.room.TypeConverter

class IntListConverters {

    @TypeConverter
    fun fromDoubleList(doubleList: List<Double>?): String? {
        return doubleList?.joinToString(",")
    }

    @TypeConverter
    fun toDoubleList(value: String?): List<Double>? {
        return value?.split(",")?.mapNotNull { it.toDoubleOrNull() }
    }
}