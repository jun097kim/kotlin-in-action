package kim.jun0.ch04.class_initialization

class User(val nickname: String, val isSubscribed: Boolean = true)

fun main() {
    val hyun = User("현석")
    println(hyun.isSubscribed)

    val gye = User("계영", false)
    println(gye.isSubscribed)

    val hye = User("혜원", isSubscribed = false)
    println(hye.isSubscribed)
}