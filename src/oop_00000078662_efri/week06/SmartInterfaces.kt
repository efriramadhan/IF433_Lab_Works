package oop_00000078662_efri.week06

interface SmartDevice{
    val id:String;
    val name:String;
}

interface Switchable{
    fun turnOn(){
        println("Sinyal Menyala.")
    }

    fun turnOff(){
        println("Sinyal Mati.")
    }
}

interface Recordable {
    fun startRecord(){
        println("Recording dimulai")
    }

    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}