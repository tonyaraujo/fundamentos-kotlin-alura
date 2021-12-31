package com.tony.fundamentos

import com.tony.fundamentos.model.Analista
import com.tony.fundamentos.model.CalculadoraBonificacao
import com.tony.fundamentos.model.Diretor
import com.tony.fundamentos.model.Gerente

fun main() {

    val tony = Diretor(nome = "Tony Araújo", cpf = "111.111.111-11", salario = 1000.00, senha = "1234", plr = 100.00)
    val thays = Gerente(nome = "Thays Neves", cpf = "222-222-222-22", salario = 1000.00, senha = "1234")
    val isabella = Analista(nome = "Isabella Neves", cpf = "333.333.333-33", salario = 1000.00)

    println("===============: Informações dos Funcionários:")
    println()
    println("NOME: ${tony.nome}")
    println("CPF: ${tony.cpf}")
    println("SALÁRIO: ${tony.salario}")
    println("BONIFICAÇÃO: ${tony.bonificacao}")

    println()
    println("NOME: ${thays.nome}")
    println("CPF: ${thays.cpf}")
    println("SALÁRIO: ${thays.salario}")
    println("BONIFICAÇÃO: ${thays.bonificacao}")

    println()
    println("NOME: ${isabella.nome}")
    println("CPF: ${isabella.cpf}")
    println("SALÁRIO: ${isabella.salario}")
    println("BONIFICAÇÃO: ${isabella.bonificacao}")

    println()

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.adicionarFuncionario(tony)
    calculadoraBonificacao.adicionarFuncionario(thays)
    calculadoraBonificacao.adicionarFuncionario(isabella)

    println("===============: Total de Bonficações:")
    println()
    println("Total: ${calculadoraBonificacao.total}")



}

