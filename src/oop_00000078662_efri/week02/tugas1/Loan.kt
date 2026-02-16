package oop_00000078662_efri.week02.tugas1

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1   // Default Argument
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}