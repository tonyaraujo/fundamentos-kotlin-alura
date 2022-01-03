package com.tony.fundamentos

/*

    Null Safaty: Segurança de Nulos.
    NPE: NullPointerException.

    * Nullable types: são os tipos que podem receber nulos. (Usamos ? Safe Call)
    * Non-Null types: são os tipos que não podem receber nulos. (Usamos o operador !!)

    * Elvis Operator: simplifica aqueles códigos que no caso do Java, tinhamos que verificar
    se determinado objeto era Nulo, caso fosse, era executada uma outra ação.


*/

fun main() {
    val produto = NovoProduto(valor = 10.00, descricao = "Arroz")
    val item1 = NovoItem(produto = produto, quantidade = 2)
    val item2 = NovoItem(produto = null, quantidade = 2)

    println("Descricao Produto item 1: ${item1.produto?.descricao}")
    println("Descricao Produto item 1: ${item1.produto?.valor}")
    println("quantidade item 1: ${item1.quantidade}")
    println("Descricao Produto item 2: ${item2.produto?.descricao}")
    println("Descricao Produto item 2: ${item2.produto?.valor}")
    println("quantidade item 2: ${item2.quantidade}")

    // Variáveis nullable's

    val cidade = Cidade(nome = "Rio de Janeiro", estado = null)

    val sigla = cidade.estado?.sigla ?: "RJ"
    println(sigla)

}

class NovoProduto(val valor: Double, val descricao: String)
class NovoItem(val produto: NovoProduto?, val quantidade: Int)

data class Estado(var sigla: String?)
data class Cidade(val nome: String, var estado: Estado?)