import examples.*

/**
 * @author Statuxia
 * Изучение основ Kotlin
 * */
fun main() {
    println("----- Basics ------")
    println("---- Format String ----")
    format(5.0)
    println("---- Create Object (Triangle) ----")
    createObject()
    println("---- Prints ----")
    printExample()
    println("---- Expressions ----")
    expressions()
    println("---- Loops ----")
    loops()
    println("---- Ranges ----")
    ranges()
    println("---- Collections ----")
    collections()
    println("---- Nullables ----")
    collections()
    println("---- Instances ----")
    instanceof()

}

fun format(a: Double) {
    println("a=$a") // Можно использовать переменные прямо в строке.

}

fun createObject() {
    // Инициализация класса
    val triangle = Triangle(5.0, 5.0, 5.0)
    Prints().message(triangle)
}

fun printExample() {
    // У такой переменной будет доступ только к методам компаньонам (статическим)
    // В переменной находится не объект, а класс.
    // Создать объект из такой переменной нельзя (возможно есть обходной путь)
    val print = Prints

    // если после названия класса есть скобки, создается объект
    val printObject = Prints()

    print.hello() // обращение к методу компаньону класса
    printObject.hello() // обращение к методу объекта
}

fun expressions() {
    val e = Expressions();
//    e.maxOf(1, 2)
    val max = e.maxOf2(1, 2)
    println("Max value of (1, 2) is $max")
    println("-- Describe Examples --")
    println(e.describe(1))
    println(e.describe("Hello"))
    println(e.describe(1000L))
    println(e.describe(2))
    println(e.describe("other"))
}

fun loops() {
    val loop = Loops("hello world! it's test line".split(" "))
    loop.forLoop() // loop with elements
    loop.forLoopIndex() // loop with indexes
//    loop.whileLoop() // another way to iterate through the list
}

fun ranges() {
    val range = Ranges()
    println("-- Check is 5 in range of one to ten --")
    range.rangeIfOneToTen(5)
    println("-- For Range --")
    range.forRange(10)
    println("\n-- For Progression --")
    range.forProgression()
}

fun collections() {
    val collections = ExampleCollections();
    collections.iterate(listOf("apple", "banana", "kiwifruit"))
    collections.contains(setOf("apple", "banana", "kiwifruit"))
    collections.filter(listOf("banana", "avocado", "apple", "kiwifruit"))
}

fun nullables() {
    val nullables = Nullables();
    nullables.printProduct("6", "7")
    nullables.printProduct("a", "7")
    nullables.printProduct("a", "b")
}

fun instanceof() {
    val instances = Instances()
    println("is Hello - String? ${instances.instanceofString("Hello")}")
    println("is 1 - Int? ${instances.instanceofString(1)}")
}