package com.tony.fundamentos

/*

Todas as classes do Kotlin herdam de Any, sendo assim, todas as classes conseguem usufruir do polimorfismo a
partir dessa referência.

Ao usarmos a classe Any ficamos restritos aos métodos dela, como é o caso do toString(), equals() e hashCode()

Com o uso do Any é necessário o casting para converter o objeto em um tipo esperado.

O Kotlin tem suporte ao Smart Cast, que verifica se um objeto é de um tipo específico. Parecido com o
Instaceof do Java.

*/

fun main() {
    val c1 = Carro(marca = "Fiat", modelo = "Mobi")
    val c2 = Carro(marca = "Ford", modelo = "Ka")
    val c3 = Movel(tipo = "Armário", fabricante = "Itatiaia")
    val c4 = Movel(tipo = "Cama", fabricante = "Ortobom")

    exibirInformacoesProduto(c1)
    exibirInformacoesProduto(c2)
    exibirInformacoesProduto(c3)
    exibirInformacoesProduto(c4)

}

data class Carro(val marca: String, val modelo: String) { }
data class Movel(val tipo: String, val fabricante: String) { }

fun exibirInformacoesProduto(produto: Any) {
    if (produto is Carro) {
        println(produto)
    }

    if (produto is Movel) {
        println(produto)
    }
}