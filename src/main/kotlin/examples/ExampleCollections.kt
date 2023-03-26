package examples

class ExampleCollections {

    fun <T> iterate(items: List<T>) {
        for (item in items) {
            println(item)
        }
    }

    fun contains(items: Set<String>) {
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
    }

    fun filter(items: List<String>) {
        items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { println(it) }
    }

}