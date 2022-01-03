package com.tony.fundamentos

fun main() {

    val assistiramCursoAndroid = setOf("Tony", "Thays", "Isabella", "Beatriz")
    val assistiramCursoKotlin = setOf("Tony", "Thays", "João", "José")

    // Podemos fazer a concatenação de duas listas do tipo Set através do método addAll().

    val assistiramAmbosComAddAll = mutableSetOf<String>()
    assistiramAmbosComAddAll.addAll(assistiramCursoAndroid)
    assistiramAmbosComAddAll.addAll(assistiramCursoKotlin)

    println(assistiramAmbosComAddAll)

    // Uma outra forma de fazer a concatenação de listas do tipo Set é usando o operador + (adição).

    println(assistiramCursoKotlin + assistiramCursoAndroid)

    // Também temos o operador union, que tem o mesmo resultado dos dois ultimos métodos de junção de sets.

    println(assistiramCursoKotlin union assistiramCursoAndroid)

    // Podemos também usar o operador de subtração nos sets.
    // Resultará em um set de quem está somente no curso de Kotlin.
    println(assistiramCursoKotlin - assistiramCursoAndroid)

    // Invertendo a subtração de sets.
    // Resultará em um set de quem está somente no curso de Android.
    println(assistiramCursoAndroid - assistiramCursoKotlin)

    // Temos o operador subtract que traz o mesmo resultado do operador de subtração.

    println(assistiramCursoKotlin subtract assistiramCursoAndroid)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    // Temos também o operador intersect que traz apenas as pessoas que estão em ambos os sets.

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    // Observamos que mesmo invertendo os sets, temos os mesmos resultados.

}

