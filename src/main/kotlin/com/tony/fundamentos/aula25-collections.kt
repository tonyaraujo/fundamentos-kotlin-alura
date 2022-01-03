package com.tony.fundamentos

import com.tony.fundamentos.model.BancoProdutos
import com.tony.fundamentos.model.Produto
import com.tony.fundamentos.model.imprimeListaProdutos
import java.math.BigDecimal

fun main() {

    // Criação do banco de produtos, com companion object (singleton) para preservar os dados salvos
    // independentemente da instância nova criada.

    val bancoProdutos1 = BancoProdutos()
    val produtos: List<Produto?> = bancoProdutos1.buscarTodos()

    println("Quantidade de produtos no banco: ${produtos.size}")
    println(produtos.imprimeListaProdutos())

    // Adicionando mais produtos no banco.

    val notebookLenovoI3 = Produto(
        codigo = 1010,
        nome = "Notebook Lenovo Ideapad S145 Core i3",
        marca = "Lenovo",
        preco = BigDecimal("2199.99")
    )

    val notebookLenovoI5 = Produto(
        codigo = 1010,
        nome = "Notebook Lenovo Ideapad S145 Core i5",
        marca = "Lenovo",
        preco = BigDecimal("2599.99")
    )

    // Salavando mais produtos na primeira instância do banco de produtos
    bancoProdutos1.salvar(notebookLenovoI3)
    bancoProdutos1.salvar(notebookLenovoI5)

    // Mesmo criando uma nova instância do banco de produtos, os dados continuam atualizados.
    // Isso por a classe tem atributos estáticos. É uma classe singleton com estado.

    val bancoProdutos2 = BancoProdutos()
    val produtos2 = bancoProdutos2.buscarTodos()

    println(produtos2.imprimeListaProdutos())


}

