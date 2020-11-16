package kim.jun0.ch03.ex5_2_2_RegularExpressionsAndTriplequotedStrings1

fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

fun main() {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
}