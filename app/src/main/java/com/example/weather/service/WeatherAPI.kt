package com.example.weather.service

import com.example.weather.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&APPID=37a8525aa57d463c36173a69369af7eb")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}