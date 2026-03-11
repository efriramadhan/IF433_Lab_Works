package oop_00000078662_efri.week06

fun MainSmartHome(){
    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Menyalakan Perangkat ===")
    lamp.turnOn()
    speaker.turnOn()
    cctv.turnOn()

    println("\n=== Mode Keamanan Aktif ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}