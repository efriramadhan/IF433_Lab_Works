package oop_00000078662_efri.week04.tugas2

fun main(){
    println("\n=== TEST EMPLOYEE HIERARCHY ===")

    val manager = Manager("Budi", 10_000_000)
    val developer = Developer("Efri", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}