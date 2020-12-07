package kim.jun0.ch05.group_by_1

fun main() {
    val list = listOf("a", "ab", "c")
    println(list.groupBy(String::first))}