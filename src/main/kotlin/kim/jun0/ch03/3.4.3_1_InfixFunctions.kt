package kim.jun0.ch03

infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)
}