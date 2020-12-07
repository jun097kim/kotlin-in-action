package kim.jun0.ch05.member_references

fun salute() = println("Salute!")

fun main() {
    run(::salute)
}