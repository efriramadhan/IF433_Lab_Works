package oop_00000078662_efri.week07.tugas1

fun main(){
    println("\n=== GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== RARITY & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")

    println("\n=== COPY & EVENT ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Senjata setelah upgrade: $upgradedItem")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}