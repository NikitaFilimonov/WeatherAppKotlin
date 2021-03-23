package com.example.myweatherapp.repository

import com.example.myweatherapp.model.Weather
import com.example.myweatherapp.model.getRussianCities
import com.example.myweatherapp.model.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() =
        Weather()

    override fun getWeatherFromLocalStorageRus() =
        getRussianCities()

    override fun getWeatherFromLocalStorageWorld() =
        getWorldCities()
}
