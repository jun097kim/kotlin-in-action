package kim.jun0.ch07.ex4_3_DestructuringDeclarations2

data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main() {
    val (name, ext) = splitFileName("example.kt")
    println(name)
    println(ext)
}