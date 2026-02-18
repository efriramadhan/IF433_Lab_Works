package oop_00000078662_efri.week03.tugas1

fun main() {

    println("=== TEST WEAPON ===")
    val weapon = Weapon("Excalibur", 300)

    weapon.damage = -50
    weapon.damage = 9999

    println("Damage sekarang: ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")

    println("\n=== TEST PLAYER ===")

    val player = Player("Efri")


    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}
