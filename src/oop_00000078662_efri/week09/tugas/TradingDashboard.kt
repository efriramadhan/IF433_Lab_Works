package oop_00000078662_efri.week09.tugas

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 20.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 8.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 5, 3.0, "CLOSED")
    )
}