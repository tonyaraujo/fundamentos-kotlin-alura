package com.tony.fundamentos

/*

De acordo com o a documentação do Kotlin, as declarações de objeto ou object declarations
criam um Singleton de maneira fácil.

Como mencionado, trata-se de um padrão de projeto com o objetivo de criar uma instância única de um objeto.



*/

fun main() {

    val c1 = Contador(mensagem = "Primeira conta criada...")
    println(c1.mensagem)
    println("Total: ${Contador.total}")

    val c2 = Contador(mensagem = "Segunda conta criada...")
    println(c2.mensagem)
    val c3 = Contador(mensagem = "Terceira conta criada...")
    println(c3.mensagem)

    println("Total: ${Contador.total}")

    val c4 = Contador(mensagem = "Quarta conta criada...")
    println(c4.mensagem)
    val c5 = Contador(mensagem = "Quinta conta criada...")
    println(c5.mensagem)

    println("Total: ${Contador.total}")

}

class Contador(val mensagem: String) {

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

}