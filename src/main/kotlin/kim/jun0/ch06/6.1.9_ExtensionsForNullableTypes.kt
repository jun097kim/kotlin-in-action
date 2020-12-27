package kim.jun0.ch06.extensions_for_nullable_types

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}
