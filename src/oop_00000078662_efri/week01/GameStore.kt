package oop_00000078662_efri.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600_000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}


fun calculateDiscount (price: Int) {
    if (price > 5000000) {
        price * 20/100
    }else {
        price * 10/100
    }
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game   : $title")
    println("Harga Akhir  : Rp $finalPrice")
}

