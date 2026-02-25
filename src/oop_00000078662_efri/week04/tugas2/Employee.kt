package oop_00000078662_efri.week04.tugas2

open class Employee(
    val name: String,
    val baseSalary: Int
) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 10) / 100
    }
}