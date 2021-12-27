package com.tony.fundamentos.model

class Gerente(nome: String, cpf: String, salario: Double, val senha: String) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.2

    fun autentica(senha: String): Boolean { return (this.senha == senha) }

}