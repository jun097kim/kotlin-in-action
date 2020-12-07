package kim.jun0.ch05.flat_map_flatten

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}