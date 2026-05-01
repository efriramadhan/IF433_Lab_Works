package oop_00000078662_efri.week10.tugas

data class ApiResponse<T>(
    val status: String,
    val data: T
)