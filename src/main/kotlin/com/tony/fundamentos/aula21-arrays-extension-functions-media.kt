package com.tony.fundamentos

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    /*
        Extensions functions:
        Criando extensions functions para retornar a média aritmética dos valores do array.
    */

    val precos = bigDecimalArrayOf("19.99", "9.60", "15.30", "115.99", "0.75")

    println("Média aritmética dos valores do Array de BigDecimal")
    val mediaDosPrecos = precos.average()
    println("Média: $mediaDosPrecos")

}

fun Array<BigDecimal>.average() : BigDecimal {
    return this.reduce { acumulador, elementoArray ->
        acumulador.add(elementoArray)
    }.divide(this.size.toBigDecimal()).setScale(2, RoundingMode.HALF_UP)
}