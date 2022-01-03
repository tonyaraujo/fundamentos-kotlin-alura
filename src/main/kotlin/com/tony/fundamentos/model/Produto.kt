package com.tony.fundamentos.model

import java.math.BigDecimal
import java.math.RoundingMode

class Produto(val codigo: Int, val nome: String, val marca: String?, preco: BigDecimal) {
    val preco = preco
        get() {
            return field.setScale(2, RoundingMode.HALF_UP)
        }

}

fun List<Produto?>.imprimeListaProdutos() : List<String> {
    return this.map { produto ->
        "Código: ${produto?.codigo} - Nome: ${produto?.nome} - Marca: ${produto?.marca} - Preço: ${produto?.preco} \n"
    }
}

