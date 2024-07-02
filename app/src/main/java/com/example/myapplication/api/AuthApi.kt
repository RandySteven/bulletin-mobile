package com.example.myapplication.api

import com.example.myapplication.data.responses.Response
import retrofit2.http.POST

interface AuthApi {

    @POST("/auth/login")
    suspend fun login() : Response;
    @POST("/auth/register")
    suspend fun register() : Response;
}