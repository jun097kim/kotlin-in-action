package kim.jun0.ch06.kotlin_collections_and_java

import kim.jun0.ch06.CollectionUtils

// 코틀린 코드
// collections.kt
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}
