package kim.jun0.ch06

import java.lang.IllegalStateException

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("Error occurred")
}