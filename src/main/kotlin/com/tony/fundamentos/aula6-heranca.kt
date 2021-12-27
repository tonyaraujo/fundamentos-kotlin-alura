package com.tony.fundamentos

import com.tony.fundamentos.model.Gerente

fun main() {
    testaComportamentosHeranca()
}

fun testaComportamentosHeranca() {
    val thays = Gerente(nome = "Thays Neves", cpf = "111.111.111-11", salario = 3500.00, senha = "1234")

    println("============: DADOS DO FUNCIONÁRIO:")
    println("NOME: ${thays.nome}")
    println("CPF: ${thays.cpf}")
    println("SALÁRIO: ${thays.salario}")
    println("BONIFICAÇÃO: ${thays.bonificacao}")
}