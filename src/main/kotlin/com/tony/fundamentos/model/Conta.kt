package com.tony.fundamentos.model

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if(valor > 0) saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) saldo -= valor
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
}