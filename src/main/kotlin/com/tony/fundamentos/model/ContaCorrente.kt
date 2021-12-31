package com.tony.fundamentos.model

class ContaCorrente(titular: String, numero: Int) : Conta(titular, numero) {
    override fun saca(valor: Double) {
        var taxa = valor * 0.1
        super.saca(taxa)
    }
}