package oop_00000078662_efri.week12

class InsufficientNumbersException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")