package kim.jun0.ch07.DateRange

import java.time.LocalDateTime

fun main() {
    val now = LocalDateTime.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
}