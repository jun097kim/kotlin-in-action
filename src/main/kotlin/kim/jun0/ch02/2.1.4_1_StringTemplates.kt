package kim.jun0.ch02

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
}