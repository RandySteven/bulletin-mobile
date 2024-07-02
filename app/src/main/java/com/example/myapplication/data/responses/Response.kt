package com.example.myapplication.data.responses

import java.util.Objects

data class Response(
    val message: String? = null, // Allow null values with ?
    val data: Any? = null, // Allow null values with ?
    val error: Error? = null // Allow null values with ?
)