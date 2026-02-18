package oop_00000078662_efri.week03

fun main(){
    val e = Employee("Budi")

    // 1. Test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test encapsulation
    e.increasePerformace()

    // 3. Test computed propertys
    println("Pajak yang harus dibayar: ${e.tax}")
}