package com.tony.fundamentos.model

interface Autenticavel {

    fun autentica(senha: String) : Boolean

}