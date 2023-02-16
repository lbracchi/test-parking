package com.example.user.model.request

import kotlinx.serialization.Serializable

@Serializable
data class SignUpRequestBody(
    val email: String,
    val password: String,
    val name: String,
    val surname: String
)
