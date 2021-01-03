package kim.jun0.ch07.ex1_1_4_BinaryOperators3

operator fun Char.times(count: Int) : String {
    return toString().repeat(count)
}

fun main() {
    println('a' * 3)
}