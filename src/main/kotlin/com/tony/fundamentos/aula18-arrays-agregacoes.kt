package com.tony.fundamentos

fun main() {

    // O Kotlin oferece métodos práticos para trabalhar com Arrays, dispensando implementações complexas.

    val idades: IntArray = intArrayOf(10, 18, 19, 15, 16, 20, 44, 12)

    // Maior valor do Array: para retornar o maior valor do Array usamos o método maxOrNull():
    val maiorElementoDoArray: Int? = idades.maxOrNull()
    println("Maior elemento do Array: $maiorElementoDoArray")

    // Menor valor do Array: para retornar o menor valor do Array usamos o método minOrNull():
    val menorElementoDoArray: Int? = idades.minOrNull()
    println("Menor elemento do Array: $menorElementoDoArray")

    // Média Aritimética: para retornar a média aritimética dos valores Array usamos o metódo average():
    val mediaAritmeticaEntreElementosArray: Double = idades.average()
    println("Média aritimética entre os elementos do Array: $mediaAritmeticaEntreElementosArray")

    // Verificando se todos os elementos do Array atendem a uma condição usando o método all {}:
    val existeElementoMaiorOuIgualADezoito: Boolean = idades.all { it >= 18 }
    println("Verificando se todos os elementos do Array são maiores que 18: $existeElementoMaiorOuIgualADezoito")

    val existeElementoMaiorOuIgualADez: Boolean = idades.all { it >= 18 }
    println("Verificando se todos os elementos do Array são maiores que 10: $existeElementoMaiorOuIgualADez")

    // Verificando se pelo menos um elemento do Array atende a uma condição usando o método any {}:
    val existeElementoIgualADezoito: Boolean = idades.any { it == 18 }
    println("Verificando se pelo menos um elemento do Array atende a uma condição: $existeElementoIgualADezoito")

    // Filtrando o Array para retornar uma nova Lista de acordo com uma condição usando o método filter {}:
    val listaFiltradaComElementosMaioresQueDezoito: List<Int> = idades.filter { it > 18 }
    println("Filtrando o Array e retornando uma lista nova com elementos maiores que 18: $listaFiltradaComElementosMaioresQueDezoito")

    // Buscando determinado valor do Array, caso não exista, retorna null, usando o método find {}:
    val retornaOValorVinteSeExistirNoArray: Int? = idades.find { it == 20 }
    println("Buscando valor Vinte no Array, caso não exista: $retornaOValorVinteSeExistirNoArray")

}