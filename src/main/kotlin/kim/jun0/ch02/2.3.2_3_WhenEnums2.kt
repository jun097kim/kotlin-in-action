package kim.jun0.ch02.ex3_2_1_WhenEnums

import kim.jun0.ch02.Color
import kim.jun0.ch02.Color.*

fun getWarmth(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

fun main() {
    println(getWarmth(BLUE))
}