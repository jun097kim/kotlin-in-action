package kim.jun0.ch08.ex3_2_3_ReturningFromLambdas2

import java.lang.StringBuilder

fun main() {
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}