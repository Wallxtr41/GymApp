package com.example.gymapp2

import java.io.Serializable

data class Achievement(
    val category: String,
    val name: String,
    val description: String,
    val status: String,
    val imageResId: Int
): Serializable
