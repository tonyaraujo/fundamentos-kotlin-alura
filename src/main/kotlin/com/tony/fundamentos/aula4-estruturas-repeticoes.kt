package com.tony.fundamentos

/*
    Estruturas de repetições com For Loop e While.
*/

fun main() {
    forLoopOrdemDecrescente()
    forLoopOrdemDecrescente()
    forLoopParesOrdemCrescente()
    whileOrdemCrescente()
    whileOrdemDecrescente()
}

private fun forLoopOrdemCrescente() {
    print("For Loop: Ordem Crescente: ")
    for (i in 0..10) {
        print("$i ")
    }
    println()
}

private fun forLoopOrdemDecrescente() {
    print("For Loop: Ordem Decrescente: ")
    for (i in 10 downTo 0) {
        print("$i ")
    }
    println()
}

private fun forLoopParesOrdemCrescente() {
    print("For Loop: Pares Ordem Crescente: ")
    for (i in 0..10 step 2) {
        print("$i ")
    }
    println()
}

private fun whileOrdemCrescente() {
    print("While: Ordem Crescente: ")
    var i = 0
    while (10 >= i) {
        print("$i ")
        i++
    }
    println()
}

private fun whileOrdemDecrescente() {
    print("While: Ordem Decrescente: ")
    var i = 10
    while (i >= 0) {
        print("$i ")
        i--
    }
}



