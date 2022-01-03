package com.tony.fundamentos

fun main() {

    // Tipos de Arrays em Kotlin:

    // IntArray:

    // Podemos criar um Array e definir a quantidade de elementos na sua criação:

    val valoresIntArray1 = IntArray(4)
    valoresIntArray1[0] = 25
    valoresIntArray1[1] = 19
    valoresIntArray1[2] = 33
    valoresIntArray1[3] = 20

    // Usando For Loop para verificar qual o maior valor do IntArray

    var maiorValorIntArray1 = Int.MIN_VALUE

    for (valorIntArray1 in valoresIntArray1) {
        if (valorIntArray1 > maiorValorIntArray1) {
            maiorValorIntArray1 = valorIntArray1
        }
    }
    println("O maior valor do IntArray1: $maiorValorIntArray1")

    // Podemos também criar um array inserindo os elementos de forma direta:

    val valoresIntArray2 = intArrayOf(25, 19, 33, 20, 55)

    // Usando Foreach para verificar qual o menor valor do array

    var menorValorIntArray2 = Int.MAX_VALUE

    valoresIntArray2.forEach { idade ->
        if (idade < menorValorIntArray2) {
            menorValorIntArray2 = idade
        }
    }
    println("O menor valor do IntArray2: $menorValorIntArray2")
    println()

    // DoubleArray:

    // Usando For Loop podemos obter os índices do Array, evitando incrementar índices manualmente:

    val valoresDoubleArray1 = doubleArrayOf(100.00, 20.00, 200.00, 10.00)

    println("Valores do DoubleArray1: ")
    for (valorDoubleArray1 in valoresDoubleArray1) print("$valorDoubleArray1 ")
    println()

    for (indiceDoubleArray1 in valoresDoubleArray1.indices) {
        valoresDoubleArray1[indiceDoubleArray1] = valoresDoubleArray1[indiceDoubleArray1] * 1.1
    }
    println("Valores do DoubleArray1 modificados: ")
    for (valorDoubleArray1 in valoresDoubleArray1) print("$valorDoubleArray1 ")
    println()
    println()

    // Usando For Loop podemos obter os índices e os valores do Array

    val valoresDoubleArray2 = doubleArrayOf(10.00, 100.00, 200.00, 15.00)

    println("Valores do DoubleArray2: ")
    for (valorDoubleArray2 in valoresDoubleArray2) print("$valorDoubleArray2 ")
    println()

    for ((indiceValorDoubleArray2, valorDoubleArray2) in valoresDoubleArray2.withIndex()) {
        valoresDoubleArray2[indiceValorDoubleArray2] = valorDoubleArray2 * 1.1
    }

    println("Valores do DoubleArray2 modificados: ")
    for (valorDoubleArray2 in valoresDoubleArray2) print("$valorDoubleArray2 ")
    println()
    println()

    // Usando ForeachIndex também podemos obter os índices e os valores do Array

    val valoresDoubleArray3 = doubleArrayOf(10.00, 15.00, 25.00, 50.00, 20.00)

    println("Valores do DoubleArray3: ")
    for (valorDoubleArray3 in valoresDoubleArray3) print("$valorDoubleArray3 ")
    println()

    valoresDoubleArray3.forEachIndexed { indiceValorDoubleArray3, valorDoubleArray3 ->
        valoresDoubleArray3[indiceValorDoubleArray3] = valorDoubleArray3 * 1.1
    }

    println("Valores do DoubleArray3 modificados: ")
    for (valorDoubleArray3 in valoresDoubleArray3) print("$valorDoubleArray3 ")
    println()
    println()
}