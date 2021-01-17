package kim.jun0.ch08.ReturnWithLabel

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAlice(people)
}