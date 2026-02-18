package oop_00000078662_efri.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformace()
    println("Pajak yang harus dibayar: ${e.tax}")
}