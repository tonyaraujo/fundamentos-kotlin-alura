package com.tony.fundamentos.model

class CalculadoraBonificacao {

    var total = 0.0
        private set

    fun adicionarFuncionario(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}