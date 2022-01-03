package com.tony.fundamentos

import java.math.BigDecimal

fun main() {

    /*
        Ordenar os valores do array
        Retornar os maiores valores
        Retornar os menores valores
    */

    val precos: Array<BigDecimal> = bigDecimalArrayOf("19.99", "9.60", "15.30", "115.99", "0.75")

    // Quando usamos o método sorted em um Array é retornado uma lista.

    val precosOrdenados: Array<BigDecimal> = precos.sorted().toTypedArray()

    // Podemos usar o método toTypedArray() para transformar uma lista em um Array.

    println("Preços ordenados de forma crescente: ${precosOrdenados.contentToString()}")
    println()

    // Take: retorna uma lista com os primeiros elementos do array.

    val osTresMenoresPrecos: Array<BigDecimal> = precosOrdenados.take(3).toTypedArray()
    println("Os três menores preços ${osTresMenoresPrecos.contentToString()}")

    // TakeLast: retorna uma lista com os últimos elementos do array.

    val osMaioresPrecos: Array<BigDecimal> = precosOrdenados.takeLast(3).toTypedArray()
    println("Os três maiores preços do Array: ${osMaioresPrecos.contentToString()}")

}

