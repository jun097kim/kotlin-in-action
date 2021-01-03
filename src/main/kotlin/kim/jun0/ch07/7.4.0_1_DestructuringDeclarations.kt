package kim.jun0.ch07.ex4_1_DestructuringDeclarations

data class Point(val x: Int, val y: Int)

fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)
}