package oop_00000078662_efri.week06

class Smarthphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smarthphone berhasil booting.")
    }
}