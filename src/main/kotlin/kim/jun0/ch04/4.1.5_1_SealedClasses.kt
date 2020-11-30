package kim.jun0.ch04.ex1_5_1_SealedClasses

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(
        eval(
            Sum(
                Sum(Num(1), Num(2)), Num(4)
            )
        )
    )
}
