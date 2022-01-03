package com.tony.fundamentos

fun main() {

    val assistiramCursoAndroid = listOf<String>("Tony", "Thays", "Isabella", "Beatriz")
    val assistiramCursoKotlin = listOf<String>("Tony", "Thays", "João", "José")

    // Podemos fazer a concatenação de duas listas através do método addAll().

    val assistiramAmbosComAddAll = mutableListOf<String>()
    assistiramAmbosComAddAll.addAll(assistiramCursoAndroid)
    assistiramAmbosComAddAll.addAll(assistiramCursoKotlin)

    println(assistiramAmbosComAddAll)

    // Uma outra forma de fazer a concatenação de listas é usando o operador + (adição).

    val assistiramAmbosComOperadorAdicao = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbosComOperadorAdicao)

    // Podemos observar que tanto usando o addAll, quando usando o operador de adição, temos o mesmo resultado.

    // Uma característica das listas é que a concatenação de listas sempre vai repetir valores.

    // Para eliminar as repetições de objetos em uma lista, usamos o método distinct.

    val assistiramAmbosComOperadorAdicaoDistinct: List<String> = assistiramAmbosComOperadorAdicao.distinct()
    val assistiramAmbosComAddAllDistintic: List<String> = assistiramAmbosComAddAll.distinct()

    println(assistiramAmbosComOperadorAdicaoDistinct)
    println(assistiramAmbosComAddAllDistintic)

    // Usando a função distinct, sempre uma nova lista imutavél é retornada.


}

