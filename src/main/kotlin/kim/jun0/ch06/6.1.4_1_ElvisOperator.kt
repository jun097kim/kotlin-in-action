package kim.jun0.ch06.elvis_operator

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}