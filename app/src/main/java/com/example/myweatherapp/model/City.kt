package com.example.myweatherapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class City(
    val city: String,
    val lat: Double,
    val lon: Double
) : Parcelable