package com.example.myapplication.ui.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun LoginForm() {
    Row {
        EmailInput(value = "Email", onChange = {} )
        PasswordInput(value = "Password", onChange = {})
    }
}