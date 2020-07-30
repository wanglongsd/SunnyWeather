package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.DailyResponse
import com.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    //实时天气数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/realtime.json
    //示范 URL:  https://api.caiyunapp.com/v2.5/66JKoEnkpyikxzK5/121.6544,25.1552/realtime.json
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    //天气预报数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/weather.json
    //示范 URL:  https://api.caiyunapp.com/v2.5/66JKoEnkpyikxzK5/121.6544,25.1552/forecast.json
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/forecast.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}