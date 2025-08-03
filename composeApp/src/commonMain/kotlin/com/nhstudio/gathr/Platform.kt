package com.nhstudio.gathr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform