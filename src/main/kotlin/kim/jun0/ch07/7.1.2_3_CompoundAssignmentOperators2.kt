package kim.jun0.ch07.ex1_2_3_CompoundAssignmentOperators2

fun main() {
    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}