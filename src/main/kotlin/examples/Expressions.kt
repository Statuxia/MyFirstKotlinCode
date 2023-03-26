package examples

class Expressions {

    /**
     *  @param a == 2
     *  @param b = 1
     *  @return a (a > b)
     */
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /**
     *  @param a == 2
     *  @param b = 1
     *  @return a (a > b)
     */
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    /**
     *  @param Any
     *  @return by expression (1, "hello", Long, !String, String, but not "Hello")
     */
    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown" // if String and not "Hello"
        }
}