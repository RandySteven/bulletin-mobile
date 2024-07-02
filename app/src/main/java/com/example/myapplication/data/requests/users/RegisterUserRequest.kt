package com.example.myapplication.data.requests.users

data class RegisterUserRequest (
    val firstName : String,
    val lastName : String,
    val userName : String,
    val dateOfBirth : String,
    val gender : String,
    val email : String,
    val password : String
)