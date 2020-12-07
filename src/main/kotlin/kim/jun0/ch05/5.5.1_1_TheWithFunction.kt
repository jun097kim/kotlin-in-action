package kim.jun0.ch05.the_with_function

import java.lang.StringBuilder

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        this.append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun main() {
    println(alphabet())
}