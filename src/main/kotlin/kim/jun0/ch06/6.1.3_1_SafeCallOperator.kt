package kim.jun0.ch06.safe_call_operator

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}