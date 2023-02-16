package com.example.user.model.request

import kotlinx.serialization.Serializable

@Serializable
data class ChangePasswordRequestBody(
    val oldPassword: String? = null,
    val newPassword: String
)
