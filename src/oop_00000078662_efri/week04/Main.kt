package oop_00000078662_efri.week04

fun main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle (brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Vehicles ---")
    val myCar = Car (brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}