package com.example.myapplication.repository.impl

import com.example.myapplication.api.AuthApi
import com.example.myapplication.repository.AuthRepository

class AuthRepositoryImpl(
    private val authApi: AuthApi
) : AuthRepository {

    override suspend fun getLoginToken() {
        authApi.login();
    }

    override suspend fun getRegisterData() {
        TODO("Not yet implemented")
    }
}