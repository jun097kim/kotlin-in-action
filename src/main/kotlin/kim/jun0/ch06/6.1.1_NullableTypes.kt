package kim.jun0.ch06.nullable_types

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}