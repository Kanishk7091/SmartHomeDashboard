package com.example.smarthomedashboard.api

import com.example.smarthomedashboard.model.Device
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("devices")
    suspend fun getDevices(): List<Device>

    @GET("devices/{id}")
    suspend fun getDevice(@Path("id") id: String): Device
}