package oop_00000078662_efri.week10.tugas

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter {
            it.toString().contains(name, ignoreCase = true)
        }
    }
}

