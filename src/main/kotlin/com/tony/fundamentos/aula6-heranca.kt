package com.tony.fundamentos

import com.tony.fundamentos.model.Diretor
import com.tony.fundamentos.model.Gerente

fun main() {
    testaComportamentosHeranca()
}

fun testaComportamentosHeranca() {
    val thays = Gerente(nome = "Thays Neves", cpf = "111.111.111-11", salario = 3500.00, senha = "1234")
    val tony = Diretor(nome = "Tony Araújo", cpf = "222.222.222-22", salario = 3500.00, senha = "112233", plr = 430.00)

    println("============: DADOS DO FUNCIONÁRIO:")
    println("NOME: ${thays.nome}")
    println("CPF: ${thays.cpf}")
    println("SALÁRIO: ${thays.salario}")
    println("BONIFICAÇÃO: ${thays.bonificacao}")

    println("============: DADOS DO FUNCIONÁRIO:")
    println("NOME: ${tony.nome}")
    println("CPF: ${tony.cpf}")
    println("SALÁRIO: ${tony.salario}")
    println("BONIFICAÇÃO: ${tony.bonificacao}")
    println("PLR: ${tony.plr}")

}