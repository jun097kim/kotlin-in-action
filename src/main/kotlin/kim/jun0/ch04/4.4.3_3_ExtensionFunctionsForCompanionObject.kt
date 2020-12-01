package kim.jun0.ch04.extension_functions_for_companion_object

// 비즈니스 로직 모듈
data class Person(val firstName: String, val lastName: String) {
    companion object {
    }
}

// 클라이언트/서버 통신 모듈
fun Person.Companion.fromJson(json: String): Person {
    return Person("junyeong", "kim")
}

fun main() {
    val p = Person.fromJson(
        """
        |{
        |  "firstName": "junyeong",
        |  "lastName": "kim"
        |}""".trimMargin()
    )
    println(p)
}

