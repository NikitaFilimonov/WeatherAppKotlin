package com.example.myweatherapp

class WeatherDTO(val fact: FactDTO?)

data class FactDTO(
    val temp: Int?,
    val feels_like: Int?,
    val condition: String
)

