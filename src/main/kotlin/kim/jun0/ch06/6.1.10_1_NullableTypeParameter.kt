package kim.jun0.ch06.nullable_type_parameter

fun <T> printHashCode(t: T) {
    println(t.hashCode())
}

fun main() {
    printHashCode(null)
}