package com.example.myapplication.repository

interface AuthRepository {
    suspend fun getLoginToken()
    suspend fun getRegisterData()
}