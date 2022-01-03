package com.tony.fundamentos

import com.tony.fundamentos.model.BancoProdutos
import com.tony.fundamentos.model.Produto

fun main() {

    val bancoProdutos = BancoProdutos()
    val listaProdutos = bancoProdutos.buscarTodos()

    // Usando o método groupBy:

    val groupBy : Map<String?, List<Produto?>> = listaProdutos.groupBy { it?.marca ?: "Desconhecida" }
    groupBy.forEach { (marca, produtos) ->
       println("Marca: $marca - Produtos: ${produtos.joinToString { it?.nome ?: "Desconhecido" }}")
    }


}

