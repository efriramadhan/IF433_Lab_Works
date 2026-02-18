package oop_00000078662_efri.week03.tugas1

class Weapon (
    val name: String,
    damage: Int
) {
    var damage: Int = damage
        set(value) {
            if (value < 0){
                println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
            } else if (value > 1000){
                println("WARNING: Damage terlalu besar! Diset menjadi 1000.")
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}