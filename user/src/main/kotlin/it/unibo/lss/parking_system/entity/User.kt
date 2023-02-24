package it.unibo.lss.parking_system.entity

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val email: String,
    val password: String,
    val name: String
)