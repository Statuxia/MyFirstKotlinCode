package examples

/**
 * Creates an object with list of <T> objects
 *
 * @param list<T>
 * */
class Loops<T>(private val list: List<T>) {

    /**
     * @return Console: printing total elements and every element in new line
     */

    fun forLoop() {
        println("-- Printing list --")
        println("> total elements: ${list.size}")
        for (item in list) {
            println(">> $item")
        }
    }

    /**
     * @return Console: printing total elements and every element by index in new line
     */
    fun forLoopIndex() {
        println("-- Printing list with indexes --")
        println("> total elements: ${list.size}")
        for (index in list.indices) {
            println(">> item at $index is ${list[index]}")
        }
    }

    /**
     * @return Console: printing total elements and every element by index in new line while index < size of list
     */
    fun whileLoop() {
        println("-- Printing list by while loop --")
        println("> total elements: ${list.size}")
        var index = 0
        while (index < list.size) {
            println("item at $index is ${list[index]}")
            index++
        }
    }
}
