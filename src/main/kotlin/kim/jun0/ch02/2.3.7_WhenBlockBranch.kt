package kim.jun0.ch02.ex3_7_WhenBlockBranch

interface Expr
class Num(val value: Int) : Expr
class Sum(var left: Expr, val right: Expr) : Expr

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.right)
            val right = evalWithLogging(e.left)
            println("sum: $left + $right")
            left + right
        }
        else -> {
            throw IllegalArgumentException("Unknown expression")
        }
    }

fun main() {
    println(
        evalWithLogging(
            Sum(
                Sum(Num(1), Num(2)),
                Num(4)
            )
        )
    )
}
