package oop_00000078662_efri.week02

class Student (
    val name : String,
    val nim : String,
    val major : String,
){
    init {
        if (nim.length != 5){
            println("WARNING: Objek tercipta dengaan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, major = "non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

