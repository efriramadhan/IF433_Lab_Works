package oop_00000078662_efri.week10.tugas

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("=== DATA COIN ===")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.0))
    txRepo.add(Transaction("TX003", 300.0))
}
