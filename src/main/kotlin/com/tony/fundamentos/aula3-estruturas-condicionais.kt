package com.tony.fundamentos

/*
    Estruturas condicionais com When.
*/

fun main() {

    val titular = "Tony Araújo"
    val conta = 1000

    var saldo = 0.0
    println(avaliarSaldoContaComWhen(saldo))

    saldo += 100
    println(avaliarSaldoContaComWhen(saldo))

    saldo += -150
    println(avaliarSaldoContaComWhen(saldo))
}

private fun avaliarSaldoContaComWhen(saldo: Double): String {
    return when {
        saldo > 0.0 -> "Conta positiva!"
        saldo == 0.0 -> "Conta zerada!"
        else -> "Conta negativa!"
    }
}
