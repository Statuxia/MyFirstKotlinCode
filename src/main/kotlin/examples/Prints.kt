package examples

class Prints {

    // метод, доступный из класса, но не из объекта
    companion object {
        fun hello() {
            println("Hello from companion!")
        }
    }

    fun hello() {
        println("Hello!")
    }

    fun message(message: String) {
        println(message);
    }

    fun message(message: Any) {
        println(message.toString())
    }

    fun message(vararg messages: Any) {
        val builder = StringBuilder()
        messages.forEach { builder.append(it) }
        println(builder)
    }
}