package kim.jun0.ch02

fun main() {
    val list = arrayListOf("10" ,"11", "1001")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}