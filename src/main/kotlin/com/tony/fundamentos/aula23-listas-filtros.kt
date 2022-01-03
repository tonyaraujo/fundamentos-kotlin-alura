package com.tony.fundamentos

import com.tony.fundamentos.model.Produto
import com.tony.fundamentos.model.imprimeListaProdutos
import java.math.BigDecimal

fun main() {

    val teclado = Produto(codigo = 1000, nome = "Teclado", marca = "Logitech", preco = BigDecimal("199.99"))
    val mouse = Produto(codigo = 1001, nome = "Mouse", marca = "Microsoft", preco = BigDecimal("89.99"))
    val mesa = Produto(codigo = 1002, nome = "Mesa", marca = "Itatiaia", preco = BigDecimal("1560.99"))
    val macbook = Produto(codigo = 1003, nome = "MacBook Air", marca = "Apple", preco = BigDecimal("15000.50"))
    val celularA21S = Produto(codigo = 1004, nome = "Celular A21S", marca = "Samsung", preco = BigDecimal("1899.79"))
    val celularA03S = Produto(codigo = 1005, nome = "Celular A03S", marca = "Samsung", BigDecimal("845.99"))
    val cadeiraGamer = Produto(codigo = 1006, nome = "Cadeira Gamer", marca = "Multilaser", BigDecimal("750.50"))

    val listaProdutos = mutableListOf(teclado, mouse, mesa, macbook, celularA21S, celularA03S, cadeiraGamer)

    // Filtrar os produtos com preço maior 1000.00

    println("Produtos com preço maior que mil reais e ordenados por preço: ")
    listaProdutos.filter { it.preco > BigDecimal("1000.00") }
        .sortedBy { it.preco }
        .imprimeListaProdutos()

    println()

    println("Produtos com preço menor que mil reais e ordenados por nome: ")
    listaProdutos.filter { it.preco < BigDecimal("1000.00") }
        .sortedBy { it.nome }
        .imprimeListaProdutos()

    println()

    println("Produtos da marca Samsung e ordenados por preço")
    listaProdutos.filter { it.marca?.startsWith("Samsung") == true }
        .sortedBy { it.preco }
        .imprimeListaProdutos()

    println()

    println("Lista com apenas os nomes do produtos")
    val nomesDosProdutos = listaProdutos.map { it.nome }
    println(nomesDosProdutos)

}

