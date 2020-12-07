package kim.jun0.ch05.executing_sequence_operations_2

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Charles", 31), Person("Dan", 31))
    println(people.asSequence().filter { it.name.length < 4 }
        .map(Person::name)
        .toList())
}