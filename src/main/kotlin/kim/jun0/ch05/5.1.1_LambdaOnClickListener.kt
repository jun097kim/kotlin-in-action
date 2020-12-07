package kim.jun0.ch05

class Button {
    var onClickListener: OnClickListener? = null
}

fun main() {
    val button = Button()
    button.onClickListener = (OnClickListener {
        println("Button clicked")
    })
}