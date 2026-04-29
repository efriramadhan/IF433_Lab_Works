package oop_00000078662_efri.week10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<T>
        where T : Comparable<T> {
    return list.filter { it > threshold }
}