package examples

data class Triangle(private val a: Double, private val b: Double, private val c: Double) {
    private val perimeter = a + b + c

    override fun toString(): String {
        return "Triangle(a=$a, b=$b, c=$c, perimeter=$perimeter)"
    }

    fun getPerimeter(): Double {
        return perimeter
    }

    fun getA(): Double {
        return a
    }

    fun getB(): Double {
        return b
    }

    fun getC(): Double {
        return c
    }
}