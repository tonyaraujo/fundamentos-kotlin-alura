package com.tony.fundamentos.model

class Diretor(nome: String, cpf: String, salario: Double, val senha: String, val plr: Double) :
    Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.3

}