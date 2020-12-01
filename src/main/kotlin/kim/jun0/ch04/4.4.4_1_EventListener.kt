package kim.jun0.ch04.event_listener

class MouseEvent

interface MouseAdapter {
    fun onMouseClicked(e: MouseEvent) {
    }

    fun onMouseEntered(e: MouseEvent) {
    }
}

class Window {
    val mouseListeners: List<MouseAdapter> = listOf()

    fun addMouseListener(listener: MouseAdapter) {
        mouseListeners + listener
    }
}

fun main() {
    val window = Window()
    window.addMouseListener(object : MouseAdapter {
        override fun onMouseClicked(e: MouseEvent) {
            println("Mouse clicked")
        }

        override fun onMouseEntered(e: MouseEvent) {
            println("Mouse entered")
        }
    })
}