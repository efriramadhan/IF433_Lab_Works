package oop_00000078662_efri.week06

class Button(override val name:String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}