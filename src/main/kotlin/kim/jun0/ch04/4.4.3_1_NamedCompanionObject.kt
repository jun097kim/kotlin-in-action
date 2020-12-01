package kim.jun0.ch04.named_companion_object

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper

class Person(@JsonProperty("name") val name: String) {
    companion object Loader {
        private val objectMapper = ObjectMapper()

        fun fromJson(jsonText: String): Person {
            return objectMapper.readValue(jsonText, Person::class.java)
        }
    }
}

fun main() {
    val person = Person.Loader.fromJson("{\"name\": \"Dmitry\"}")
    println(person.name)

    val person2 = Person.Loader.fromJson("{\"name\": \"Brent\"}")
    println(person2.name)
}