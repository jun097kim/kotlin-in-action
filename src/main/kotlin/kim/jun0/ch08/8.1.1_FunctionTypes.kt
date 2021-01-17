package kim.jun0.ch08.ex1_1_FunctionTypes

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}

fun main() {
    var url = "http://kotl.in"
    performRequest(url) { code, content -> /*...*/ }
    performRequest(url) { code, page -> /*...*/ }
}