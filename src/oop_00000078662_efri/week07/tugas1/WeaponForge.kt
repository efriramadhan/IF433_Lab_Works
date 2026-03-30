package oop_00000078662_efri.week07.tugas1

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {

        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Naga Legendaris", 100, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}