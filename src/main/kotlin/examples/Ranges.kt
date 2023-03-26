package examples

class Ranges {

    /**
     *  @param x == 5
     *  @return Console: fits in range
     */
    fun rangeIfOneToTen(x: Int) {
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        } else {
            println("fits not in range")
        }
    }

    /**
     *  @param x == 10
     *  @return Console: 1 2 3 4 5 6 7 8 9 10
     */
    fun forRange(y: Int) {
        for (x in 1..y) {
            print("$x ")
        }
    }

    /**
     *  @return Console: 1 3 5 7 9 (from 1 to 10 step 2)
     *                   9 6 3 0 (from 9 to 0 step 3)
     */
    fun forProgression() {
        for (x in 1..10 step 2) {
            print("$x ")
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print("$x ")
        }
    }

}