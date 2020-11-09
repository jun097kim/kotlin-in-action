package kim.jun0.ch02.ex5_2_1_TryAsAnExpression

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}