package kim.jun0.ch04.client_as_data_class

data class Client(val name: String, val postalCode: Int)

fun main() {
    val lee = Client("이계영", 4122)
    println(lee.copy(postalCode = 4000))
}