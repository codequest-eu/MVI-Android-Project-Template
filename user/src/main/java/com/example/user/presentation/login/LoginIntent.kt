package com.example.user.presentation.login

sealed class LoginIntent {
    object Login : LoginIntent()
    object Logout : LoginIntent()
    object TestIntentThatIsSentVeryOften : LoginIntent()
}
