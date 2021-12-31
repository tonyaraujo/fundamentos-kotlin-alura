package com.tony.fundamentos

import com.tony.fundamentos.model.ContaCorrente
import com.tony.fundamentos.model.ContaPoupanca

fun main() {
    val ccTony = ContaCorrente(titular = "Tony Araújo", numero = 1000)
    val cpTony = ContaPoupanca(titular = "Tony Araújo", numero = 1001)

    val ccThays = ContaCorrente(titular = "Thays Neves", numero = 2000)
    val cpThays = ContaPoupanca(titular = "Thays Neves", numero = 2001)

    println("Depósito conta ${ccTony.titular}")
    println("Valor: R$ 1000,00")
    ccTony.deposita(1000.00)
    println("Saldo conta ${ccTony.saldo}")
    println()

    println("Saque conta ${ccTony.titular}")
    println("Valor: R$ 100,00")
    ccTony.saca(100.00)
    println("Saldo conta ${ccTony.saldo}")
    println()

    println("Depósito conta ${ccThays.titular}")
    println("Valor: R$ 1000,00")
    ccThays.deposita(1000.00)
    println("Saldo conta ${ccThays.saldo}")
    println()

    println("Saque conta ${ccThays.titular}")
    println("Valor: R$ 100,00")
    ccThays.saca(100.00)
    println("Saldo conta ${ccThays.saldo}")
    println()

}