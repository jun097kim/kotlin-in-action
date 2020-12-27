package kim.jun0.ch06

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor: Processor<Unit> {
    override fun process() {
        // 업무 처리 코드
    }
}