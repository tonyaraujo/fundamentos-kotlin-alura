package com.tony.fundamentos


/*
    Estruturas condicionais com if's encadeados.
*/

fun main() {

    val titular = "Tony Araújo"
    val conta = 1000

    var saldo = 0.0
    println(avaliarSaldoContaComIf(saldo))

    saldo += 100
    println(avaliarSaldoContaComIf(saldo))

    saldo += -150
    println(avaliarSaldoContaComIf(saldo))
}

private fun avaliarSaldoContaComIf(saldo: Double): String {
    return if (saldo > 0.0) {
        "Conta positiva!"
    } else if (saldo == 0.0) {
       "Conta zerada!"
    } else {
        "Conta negativa!"
    }
}