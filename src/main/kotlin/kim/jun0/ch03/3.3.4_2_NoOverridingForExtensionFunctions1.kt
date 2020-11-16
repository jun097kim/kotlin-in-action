package kim.jun0.ch03

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun main() {
    val view: View = Button()
    view.click()
}