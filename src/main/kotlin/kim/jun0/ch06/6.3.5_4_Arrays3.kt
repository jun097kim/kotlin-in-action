package kim.jun0.ch06.arrays_3

fun main() {
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}