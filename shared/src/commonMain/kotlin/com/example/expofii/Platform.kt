package com.example.expofii

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform