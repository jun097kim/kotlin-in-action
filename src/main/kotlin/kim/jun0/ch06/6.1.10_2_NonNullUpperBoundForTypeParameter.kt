package kim.jun0.ch06.non_null_upper_bound_for_type_parameter

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun main() {
//    printHashCode(null)
    printHashCode(42)
}