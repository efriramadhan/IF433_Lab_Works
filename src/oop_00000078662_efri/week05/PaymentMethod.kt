package oop_00000078662_efri.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}