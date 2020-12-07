package kim.jun0.ch05.member_references_2

data class Person(val name: String, val age: Int)

fun main() {
    val p = Person("Dmitry", 34)
    val personsAgeFunction: (Person) -> Int = Person::age
    println(personsAgeFunction(p))

    val dmitrysAgeFunction: () -> Int = p::age
    println(dmitrysAgeFunction())
}