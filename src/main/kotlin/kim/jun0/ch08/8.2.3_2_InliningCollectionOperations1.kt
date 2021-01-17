package kim.jun0.ch08.ex2_3_2_InliningCollectionOperations1

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main() {
    println(people.filter { it.age < 30 }
        .map(Person::name))
}