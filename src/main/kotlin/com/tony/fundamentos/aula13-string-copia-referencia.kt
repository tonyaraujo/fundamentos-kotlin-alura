package com.tony.fundamentos

/*

    Variáveis primitivas são imutáveis (valores são passados por cópia);
    Classes são mutáveis (valores são passados por referência).
    Strings em Kotlin são imutáveis. Embora sejam classes, são imutáveis.

*/

fun main() {
    var x = 10
    var y = x // Aqui é inserido uma cópia do valor de x para y
    x = 60
    println("Valor de X: $x")
    println("Valor de Y: $y")

    var p1 = Pessoa(nome = "Tony")
    var p2 = Pessoa(nome = "Thays")
    p1 = p2 // Aqui é inserido a referência da memória p2 para p1
    println("Valor de p1: ${p1.nome}")
    println("Valor de p2: ${p2.nome}")

    var fruta1 = "Maçã"
    var fruta2 = fruta1
    fruta1 = "Banana"

    println("Valor da variável fruta1: $fruta1")
    println("Valor da variável fruta2: $fruta2")


}

class Pessoa(val nome: String)