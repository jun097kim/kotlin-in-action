package kim.jun0.ch02.ex3_6_2_IfToWhen1

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(var left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Num(1), Num(2))))
}
