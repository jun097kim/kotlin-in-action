package kim.jun0.ch03

fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    println("Kotlin".lastChar())
}