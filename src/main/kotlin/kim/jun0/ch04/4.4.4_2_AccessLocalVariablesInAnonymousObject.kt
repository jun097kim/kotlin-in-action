package kim.jun0.ch04.access_local_variables_in_anonymous_object

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

fun countClicks(window: Window) {
    var clickCount = 0

    window.addMouseListener(object : MouseAdapter {
        override fun onMouseClicked(e: MouseEvent) {
            clickCount++
        }
    })
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