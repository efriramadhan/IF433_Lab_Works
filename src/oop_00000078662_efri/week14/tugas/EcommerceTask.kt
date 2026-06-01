package oop_00000078662_efri.week14.tugas
import java.io.File
import java.io.FileWriter

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), kalkulasi + I/O + Notifikasi sekaligus (SRP)
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(record: String)
}

class CsvOrderRepository(private val fileName: String = "orders.csv") : OrderRepository {
    override fun saveOrder(record: String) {
        // safe resource handling pakai use { } -> auto-close
        FileWriter(fileName, true).use { writer ->
            writer.append("$record\n")
        }
    }
}

// --- SRP + DIP: pisahkan notifikasi ke abstraksi ---
interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

// --- Bot utama: kedua abstraksi disuntik lewat constructor (DIP) ---
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // (masih) pakai when — akan dibereskan di langkah OCP berikutnya
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder("$itemName,$finalPrice,$customerType")
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}