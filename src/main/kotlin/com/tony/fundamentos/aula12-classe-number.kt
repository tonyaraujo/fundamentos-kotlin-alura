package com.tony.fundamentos

/*

Ao utilizar variáveis do tipo primitivo (Int, Double entre outras) temos acesso a uma referência comum entre elas
que permite o uso do polimorfismo para tarefas genéricas, a Number.

Também é possível fazer a conversão entre valores primitivos.

*/

fun main() {
    val idade = 30
    val salario = 1000.00
    val x = 10
    val y = 15.05

    imprimeValorVariavelPrimitiva(idade)
    imprimeValorVariavelPrimitiva(salario)
    imprimeValorVariavelPrimitiva(x)
    imprimeValorVariavelPrimitiva(y)

    println("Fazendo a conversão de tipos...")
    println("De Int para Double: ${idade.toDouble()}")
    println("De Double para Int: ${salario.toInt()}")

}

fun imprimeValorVariavelPrimitiva(valor: Number) {
    println("Valor $valor")
}