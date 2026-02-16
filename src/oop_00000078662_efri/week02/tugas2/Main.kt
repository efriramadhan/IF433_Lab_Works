package oop_00000078662_efri.week02.tugas2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > 0 && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (hero.hp == 0) {
        println("${hero.name} KALAH!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
