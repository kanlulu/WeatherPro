package com.kanlulu.weatherpro.logic.network

import com.kanlulu.weatherpro.SunnyWeatherApplication
import com.kanlulu.weatherpro.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * author:kanlulu
 * data  :2020-10-12 11:45
 **/
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.WEATHER_TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}