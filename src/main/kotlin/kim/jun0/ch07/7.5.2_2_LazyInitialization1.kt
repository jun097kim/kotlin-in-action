package kim.jun0.ch07.ex5_2_2_LazyInitialization1

class Email { /*...*/ }

fun loadEmails(person: Person): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(/*...*/)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main() {
    val p = Person("Alice")
    p.emails
    p.emails
}