package me.bekmnsrw.omni

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform