package examples

import kotlin.reflect.typeOf

class Instances {

    fun instanceofString(obj: Any): Boolean {
        return (obj is String)
    }
}