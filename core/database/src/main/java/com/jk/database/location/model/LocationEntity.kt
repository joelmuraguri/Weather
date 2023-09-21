package com.jk.database.location.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Locations")
data class LocationEntity(
    @PrimaryKey val cityId : Int,
    val longitude : Double,
    val latitude : Double,
    val cityName : String
)
