package com.tony.fundamentos

import com.tony.fundamentos.model.Produto
import com.tony.fundamentos.model.imprimeListaProdutos
import java.math.BigDecimal

fun main() {

    /*
        No Kotlin temos as listas imutáveis e mutáveis:

        A função sortBy reorganiza os elementos da coleção que a invocou de acordo com um critério, enquanto a função
        sortedBy cria uma nova coleção ordenada de acordo com um critério, poupando a lista original.

        A função sortBy manipula a coleção que invocou a função e, por isso mesmo, só está presente em coleções
        mutáveis, já a função sortedBy cria uma nova coleção sem interferir no objeto que invoca a função.
    */

    val teclado = Produto(codigo = 1000, nome = "Teclado", marca = "Logitech", preco = BigDecimal("199.99"))
    val mouse = Produto(codigo = 1001, nome = "Mouse", marca = "Microsoft", preco = BigDecimal("89.99"))
    val mesa = Produto(codigo = 1002, nome = "Mesa", marca = "Itatiaia", preco = BigDecimal("1560.99"))
    val macbook = Produto(codigo = 1003, nome = "MacBook Air", marca = "Apple", preco = BigDecimal("15000.50"))
    val celularA21S = Produto(codigo = 1004, nome = "Celular A21S", marca = "Samsung", preco = BigDecimal("1899.79"))

    // List é um tipo de lista imutável, portanto não podemos usar o método add para adicionar novos elementos.

    val listaProdutos: List<Produto> = listOf(teclado, mouse, mesa, macbook, celularA21S)


    val celularA03S = Produto(codigo = 1005, nome = "Celular A03S", marca = "Samsung", BigDecimal("845.99"))
    val cadeiraGamer = Produto(codigo = 1006, nome = "Cadeira Gamer", marca = "Multilaser", BigDecimal("750.50"))

    // O código abaixo não compila. List não aceita alterações na lista.

    // listaProdutos.add(celularA03S)

    // Através do método toMutableList() posso transformar uma lista imutável em mutável.

    val listaProdutosMutavel: MutableList<Produto> = listaProdutos.toMutableList()

    // Podemos agora adicionar novos elementos na lista

    listaProdutosMutavel.add(celularA03S)
    listaProdutosMutavel.add(cadeiraGamer)

    // Ordenação da Lista: usamos o método sortedBy passando um critério de ordenação:

    println("Lista original de Produtos: ")
    listaProdutosMutavel.imprimeListaProdutos()
    println()

    println("Lista ordenada por Nome: ")
    val listaOrdenadaPorNome = listaProdutosMutavel.sortedBy { it.nome }
    listaOrdenadaPorNome.imprimeListaProdutos()
    println()

    println("Lista ordenada por Marca: ")
    val listaOrdenadaPorMarca = listaProdutosMutavel.sortedBy { it.marca }
    listaOrdenadaPorMarca.imprimeListaProdutos()
    println()

    println("Lista ordenada por Preço: ")
    val listaOrdenadaPorPreco = listaProdutosMutavel.sortedBy { it.preco }
    listaOrdenadaPorPreco.imprimeListaProdutos()
    println()

}



