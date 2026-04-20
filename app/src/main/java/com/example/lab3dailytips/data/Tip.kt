package com.example.lab3dailytips.data

data class Tip(
    val day: Int,
    val title: String,
    val shortDescription: String,
    val fullDescription: String,
    val imageResId: Int
)