package oop_00000078662_efri.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}