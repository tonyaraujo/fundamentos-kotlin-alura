package com.tony.fundamentos.model

abstract class Funcionario(val nome: String, val cpf: String, val salario: Double) {
   abstract val bonificacao: Double
}