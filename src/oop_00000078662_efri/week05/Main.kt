package oop_00000078662_efri.week05

fun main() {
    val dosen1 = Dosen (nama = "Pak Alex", nidn = "0123455");
    val admin1 = Admin (nama = "Bu Siti");

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1);

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------")
    }

    println("=== Test MathHelper ===")

    val mathHelper = MathHelper()

    println("Luas Persegi: ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")

    println()
}