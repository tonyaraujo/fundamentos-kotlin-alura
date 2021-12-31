package com.tony.fundamentos

import com.tony.fundamentos.model.Conta
import com.tony.fundamentos.model.ContaCorrente

/*

Ao trabalhar com Orientação a Objetos, precisamos ficar atentos ao usar uma variável por conta da atribuição
por cópia ou referência.

Ao alterar uma variável de um objeto, todas as variáveis que apontam para o objeto enxergam o mesmo valor.

Ao utilizar uma referência, qualquer modificação que é feita no objeto é único para todas as variáveis que
apontam para a referência.

As classes são as responsáveis por modificar seus atributos. A boa prática de orientação a objetos é que qualquer
comportamento que ajuste o estado da classe (modifique os atributos), deve ser implementado pela própria classe.

*/

fun main() {

    val salarioTony = 3000.00
    val salarioThays = 3000.00

    val contaTony = ContaCorrente(titular = "Tony Araújo", numero = 1001)
    contaTony.deposita(salarioTony)

    val contaThays = ContaCorrente(titular = "Thays Neves", numero = 2002)
    contaThays.deposita(salarioThays)

    println(" =============: Conta Tony")

    println(contaTony.titular)
    println(contaTony.numero)
    println(contaTony.saldo)

    println(" =============: Conta Thays")

    println(contaThays.titular)
    println(contaThays.numero)
    println(contaThays.saldo)

    println(" =============: Movimentações Tony")

    val comissaoTony = 500.00

    println("Depósito $comissaoTony referente comissão.")
    contaTony.deposita(comissaoTony)
    println("Saldo conta Tony: ${contaTony.saldo}")

    println(" =============: Movimentações Thays")

    val comissaoThays = 575.00

    println("Depósito $comissaoThays referente comissão.")
    contaThays.deposita(comissaoThays)
    println("Saldo conta Thays: ${contaThays.saldo}")

    println(" =============: Transferências")

    if (contaThays.transfere(valor = 500.00, contaDestino = contaTony)) {
        println("Transferência feita com sucesso!")
    } else {
        println("Falha na transferência!")
    }

    println("Saldo conta Tony: ${contaTony.saldo}")
    println("Saldo conta Thays: ${contaThays.saldo}")

}


