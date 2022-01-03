package com.tony.fundamentos

fun main() {

    // Ranges: são variáveis que conseguem iterar por valores em uma sequência ou em uma progressão.

    // Por exemplo: uma série de 1 até 10 usando o método ".rangeTo()":
    val serieDeUmAteDezUsandoRangeTo = 1.rangeTo(10)
    println("Série de valores inteiros de um até dez usando o método rangeTo(): ")
    for (serie in serieDeUmAteDezUsandoRangeTo) print("$serie ")
    println()
    println()

    // Utilizando o operador ".." podemos obter o mesmo resultado. É uma açucar sintático do Kotlin.

    println("Série de valores inteiros de um até dez usando o operador 1..10 (Dois pontos): ")
    val serieDeUmAteDezUsandoOperadorDoisPontos = 1..10
    for (serie in serieDeUmAteDezUsandoOperadorDoisPontos) print("$serie ")
    println()
    println()

    println("Série de pares de zero até cem usando o operador 0..100 com step 2:")
    val serieDeParesDeZeroAteCemUsandoOperadorDoisPontos = 0..100 step 2
    for (serie in serieDeParesDeZeroAteCemUsandoOperadorDoisPontos) print("$serie ")
    println()
    println()

    // Utilizando o operador "until" podemos obter um resultado semelhante.
    // O operador "until" não vai até o fim da série definida. Vai até o penúltimo valor de acordo com a regra do step

    println("Série de inteiros de zero até dez usando o operador until sem step:")
    val serieDeZeroAteDezComOperadorUntil = 0.until(10)
    for (serie in serieDeZeroAteDezComOperadorUntil) print("$serie ")
    println()
    println()

    println("Série de pares de zero até cem usando o operador until com step 2:")
    val serieParesDeZeroAteCemComOperadorUntil = 0.until(100) step 2
    for (serie in serieParesDeZeroAteCemComOperadorUntil) print("$serie ")
    println()
    println()

    // Podemos também criar séries reversas utilizando o operador "downTo":

    println("Série reversa de dez até zero usando o operador downTo:")
    val serieReversaDeDezAteZeroUsandoOperadoDownTo = 10 downTo 0
    for (serie in serieReversaDeDezAteZeroUsandoOperadoDownTo) print("$serie ")
    println()
    println()

    println("Série reversa de pares de cem até zero usando o operador downTo com step 2:")
    val serieReversaDeCemAteZeroUsandoOperadorDownTo = 100 downTo 0 step 2
    for (serie in serieReversaDeCemAteZeroUsandoOperadorDownTo) print("$serie ")
    println()
    println()

    // Podemos também verificar se determinado valor está dentro de Range:

    println("Série de inteiros de zero até cem. Verificar existência de valor no intervalo:")
    val serieNumerosDeZeroAteCemComStepTres = 0..100 step 3
    println("O número 555 está na série: ${40 in serieNumerosDeZeroAteCemComStepTres}")
    println("O número 351 está na série: ${24 in serieNumerosDeZeroAteCemComStepTres}")
    println("O número 613 está na série: ${33 in serieNumerosDeZeroAteCemComStepTres}")
    println()

    // O operador "in" em um "for" é usado para iteração de valores em arrays e coleções.
    // O pereador "in" em um "if" é usado para verificar a existência de um valor em um Range.

    // Podemos criar Ranges Char:

    println("Alfabeto com letras minúsculas (char):")
    val alfabetoComLetrasMinusculas = 'a'..'z'
    for (letra in alfabetoComLetrasMinusculas) print("$letra ")
    println()

    println("Alfabeto com letras maiúsculas (char): ")
    val alfabetoComLetrasMaiusculas = 'A'..'Z'
    for (letra in alfabetoComLetrasMaiusculas) print("$letra ")
    println()

    // Podemos usar o step e também verificar a existência de um caracter:

    println("Alfabeto com letras maiúsculas (char) com step:")
    val alfabetoComLetrasMaiusculasStepDois = 'A'..'Z' step 2
    for (letra in alfabetoComLetrasMaiusculasStepDois) print("$letra ")
    println()
    println("Existe a letra D no Range: ${'J' in alfabetoComLetrasMaiusculasStepDois}")
    println("Existe a letra W no Range: ${'W' in alfabetoComLetrasMaiusculasStepDois}")
    println()



}