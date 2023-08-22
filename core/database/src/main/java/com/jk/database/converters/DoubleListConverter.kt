package com.jk.database.converters

import androidx.room.TypeConverter

class DoubleListConverter {

    @TypeConverter
    fun fromList(list: List<Double>?): String? {
        return list?.joinToString(",")
    }

    @TypeConverter
    fun toList(data: String?): List<Double>? {
        return data?.split(",")?.map { it.toDouble() }
    }
}