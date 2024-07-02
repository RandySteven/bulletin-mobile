package com.example.myapplication.data.requests.tasks

data class CreateTaskRequest(
    val task : TaskRequest,
    val reward : RewardRequest,
    val categories : CategoriesRequest
)
