package com.github.cjrvdev.kmpplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform