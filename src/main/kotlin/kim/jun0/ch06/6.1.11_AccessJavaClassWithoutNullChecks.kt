package kim.jun0.ch06.access_java_class_without_null_checks

import kim.jun0.ch06.Person

fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

fun main() {
    yellAt(Person(null))
}