package com.tony.fundamentos

import com.tony.fundamentos.model.Cliente
import com.tony.fundamentos.model.SistemaInterno

fun main() {
    val cliente1 = Cliente("Tony Araújo", "111.111.111-11", "1234")


    val sistemaInterno = SistemaInterno()
    if (sistemaInterno.autenticou(cliente1, "1234")) println("Autenticou!") else println("Não Autenticou!")

}