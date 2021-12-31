package com.tony.fundamentos.model

class SistemaInterno {

    fun autenticou(autenticavel: Autenticavel, senha: String) : Boolean {
        return autenticavel.autentica(senha)
    }

}