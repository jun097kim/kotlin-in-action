@file:JvmName("ProcessTheAnswer")
package kim.jun0.ch08.ProcessTheAnswer

/* 코틀린 선언 */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}