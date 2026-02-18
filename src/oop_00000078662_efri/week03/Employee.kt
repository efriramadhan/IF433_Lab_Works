package oop_00000078662_efri.week03

class Employee(val name: String){
    private var performanceRating: Int = 3
        var salary: Int = 0
            set(value) {
                if (value < 0 ){
                    println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                    field = 0
                } else {
                    field = value
                }
            }
    fun increasePerformace(){
        performanceRating++
        println("Kinerja $name meningkat! Rating $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating $performanceRating")
    }
}
