package com.tony.fundamentos

import java.math.BigDecimal

fun main() {

    /*
        Extensions functions:
        Criando extensions functions para somar os valores do array.
    */

    val precos = bigDecimalArrayOf("19.99", "9.60", "15.30", "115.99", "0.75")

    println("Somando os valores do Array de BigDecimal")
    val somaDosPrecos = precos.sum()
    println("Soma: $somaDosPrecos")

}

fun Array<BigDecimal>.sum() : BigDecimal {
    return this.reduce { acumulador, elementoArray ->
        acumulador.add(elementoArray)
    }
}