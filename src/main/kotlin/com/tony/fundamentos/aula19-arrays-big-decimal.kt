package com.tony.fundamentos

import java.math.BigDecimal

fun main() {

    /*

        O tipo BigDecimal fornece opções de precisão de valores monetários. Entretanto não é um tipo do Kotlin e,
        sendo assim, não existe um tipo de Array de BigDecimal já implementado como IntArray e DoubleArray.

        Podemos usar a classe Array<> Genérica recebendo um BigDecimal para criar um Array de BigDecimal.
        Uma das formas de fazer isso é criando o Array Genérico de BigDecimal, determinando um tamanho fixo
        e inicializando o Array. No caso do Array de BigDecimal, podemos incializar o Array com o menor valor
        do BigDecimal, através da constante BigDecimal.ZERO.

    */

    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    println("Os elementos do Array de BigDecimal: ${salarios.contentToString()}")

    // Podemos ver que os cinco elementos do Array de BigDecimal estão com o valor zero.
    // Podemos alterar esses valores da seguinte forma:

    salarios[0] = "1500.50".toBigDecimal()
    salarios[1] = "1000.99".toBigDecimal()
    salarios[2] = "1800.00".toBigDecimal()
    salarios[3] = "4500.99".toBigDecimal()
    salarios[4] = "5000.50".toBigDecimal()

    println("Os elementos do Array de BigDecimal com as modificações: ${salarios.contentToString()}")

    // Uma forma mais prática para trabalhar com Array de BigDecimal é criando uma função semelhante intArrayOf().

    val salarios2 = bigDecimalArrayOf("2000.00", "3000.00", "4000.00", "1500.00", "1000.00")
    println("Os elementos do Array de BigDecimal utilizando a função com varargs: ${salarios2.contentToString()}")

    // Agora podemos trabalhar com algumas das funções práticas específicas para arrays do Kotlin:

    println("Maior salário: ${salarios2.maxOrNull()}")
    println("Menor salário: ${salarios2.minOrNull()}")
    println("Verificar se 2000.00 existe: ${salarios2.any { it == "2000.00".toBigDecimal() }}")
    println("Verificar se todos os salários são maiores que 1500.00 ${salarios2.all { it > "1500.00".toBigDecimal() }}")
    println("Filtrando os salários maiores que 1500.00 ${salarios2.filter { it > "1500.00".toBigDecimal() }}")
}

    // O opereador "vararg" permite que passemos um ou vários valores como parâmetro para uma função.
    // Então essa função receberá um vararg de Strings e retornará um Array de BigDecimals

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}