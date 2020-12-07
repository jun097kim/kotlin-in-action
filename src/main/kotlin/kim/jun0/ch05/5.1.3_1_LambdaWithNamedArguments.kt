package kim.jun0.ch05.lambda_with_named_arguments_1

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val name = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(name)
}