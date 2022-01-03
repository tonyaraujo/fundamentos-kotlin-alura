package com.tony.fundamentos.model

import java.math.BigDecimal

class BancoProdutos {

    // Salva um novo produto no objeto estático.
    fun salvar(produto: Produto) {
        dados.add(produto)
    }

    // Retorna uma nova lista imutável, somente leitura.
    fun buscarTodos() : List<Produto?> {
        return dados.toList()
    }

    fun buscarPorId(codigo: Int) : Produto? {
        return dados.find { it?.codigo == codigo }
    }

    companion object {
        private var dados : MutableList<Produto?> = carregarBanco()
    }
}

private fun carregarBanco() : MutableList<Produto?> {
    return mutableListOf<Produto?>(
        Produto(codigo = 1000, nome = "Kit Logitech K235", marca = "Logitech", preco = BigDecimal("119.99")),
        Produto(codigo = 1001, nome = "Teclado Logitech K480", marca = "Logitech", preco = BigDecimal("299.99")),
        Produto(codigo = 1001, nome = "Teclado Logitech K380", marca = "Logitech", preco = BigDecimal("199.99")),
        Produto(codigo = 1001, nome = "Mouse Logitech MX VERTICAL", marca = "Logitech", preco = BigDecimal("599.99")),
        Produto(codigo = 1002, nome = "Mesa Tok Stock Escritório", marca = "Tok Stock", preco = BigDecimal("1100.99")),
        Produto(codigo = 1002, nome = "Cadeira Tok Stock Escritório", marca = "Tok Stock", preco = BigDecimal("900.99")),
        Produto(codigo = 1002, nome = "Guarda Roupas Tok Stock", marca = "Tok Stock", preco = BigDecimal("1259.99")),
        Produto(codigo = 1002, nome = "Teclado USB Multilaser", marca = "Multilaser", preco = BigDecimal("49.99")),
        Produto(codigo = 1002, nome = "Mouse USB Multilaser", marca = "Multilaser", preco = BigDecimal("39.99")),
        Produto(codigo = 1002, nome = "Carregador Celular USB Multilaser", marca = "Multilaser", preco = BigDecimal("29.99")),
        Produto(codigo = 1003, nome = "MacBook Pro", marca = "Apple", preco = BigDecimal("14999.99")),
        Produto(codigo = 1003, nome = "MacBook Air", marca = "Apple", preco = BigDecimal("7999.99")),
        Produto(codigo = 1003, nome = "Mac Mini", marca = "Apple", preco = BigDecimal("6000.99")),
        Produto(codigo = 1003, nome = "Iphone 11", marca = "Apple", preco = BigDecimal("3599.99")),
        Produto(codigo = 1004, nome = "Samsung A21S", marca = "Samsung", preco = BigDecimal("799.00")),
        Produto(codigo = 1005, nome = "Samsung A03S", marca = "Samsung", BigDecimal("845.99")),
        Produto(codigo = 1005, nome = "Samsung A32", marca = "Samsung", BigDecimal("1349.99")),
        Produto(codigo = 1005, nome = "Samsung S20", marca = "Samsung", BigDecimal("2469.99")),
        Produto(codigo = 1006, nome = "Notebook Samsung Book Core i3", marca = "Samsung", BigDecimal("2965.77"))
    )
}