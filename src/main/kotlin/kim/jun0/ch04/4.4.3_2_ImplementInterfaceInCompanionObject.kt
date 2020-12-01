package kim.jun0.ch04.implement_interface_in_companion_object

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}

class Person(@JsonProperty("name") val name: String) {
    companion object : JsonFactory<Person> {
        private val objectMapper = ObjectMapper()

        override fun fromJson(jsonText: String): Person {
            return objectMapper.readValue(jsonText, Person::class.java)
        }
    }
}

fun <T> loadFromJson(factory: JsonFactory<T>): T =
    factory.fromJson("{\"name\": \"junyeong\"}")

fun main() {
    val person = loadFromJson(Person)
    println(person.name)
}