package kim.jun0.ch07.ex1_3_2_UnaryOperators1

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}
