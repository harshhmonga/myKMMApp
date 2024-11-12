package org.harshhmonga.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform