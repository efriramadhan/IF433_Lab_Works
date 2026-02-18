package oop_00000078662_efri.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            field = value
        }
}