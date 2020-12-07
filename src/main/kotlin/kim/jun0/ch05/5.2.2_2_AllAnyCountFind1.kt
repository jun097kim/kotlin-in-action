package kim.jun0.ch05.all_any_count_find_1

fun main() {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
}