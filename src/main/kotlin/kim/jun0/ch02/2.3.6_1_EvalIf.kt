package kim.jun0.ch02.EvalIf

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(var left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Num(1), Num(2))))
}
