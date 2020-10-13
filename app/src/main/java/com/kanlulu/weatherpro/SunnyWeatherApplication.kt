package com.kanlulu.weatherpro

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * author:kanlulu
 * data  :2020-10-12 11:35
 **/
class SunnyWeatherApplication : Application() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val WEATHER_TOKEN = "QS8NtGuKzvdJMpz8"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}