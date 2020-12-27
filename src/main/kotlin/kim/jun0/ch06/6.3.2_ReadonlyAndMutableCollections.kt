package kim.jun0.ch06.readonly_and_mutable_collections

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main() {
    val source : Collection<Int> = arrayListOf(3,5,7)
    val target : MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}