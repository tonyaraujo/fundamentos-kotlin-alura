package com.tony.fundamentos

/*

Ao criar variáveis no Kotlin, percebemos que existem algumas restrições:

1 - Todas as variáveis precisam de um valor de inicialização para o programa rodar. Código em Kotlin não permite que
nenhuma variável fique sem valor de inicialização, portanto, para compilar o código e rodar, todas as variáveis devem
ser inicializadas.

2 - Não é necessário declarar explicitamente o tipo da variável. No Kotlin existe a técnica conhecida como inferência
de tipo que é quando o compilador interpreta o valor que está sendo atribuído para a variável e determina qual é o
seu tipo implicitamente.

3 - Variáveis que começam com a palavra reservada "var": mutáveis e com "val": imutáveis.

*/

fun main() {

    // Na declaração, o tipo de uma variável pode ser definido de forma explícita ou por inferência.

    val conta: Int = 1000
    // conta está sendo declarada com o tipo Int de forma explícita. (Não tem necessidade).

    var saldo = 0.0
    // saldo está sendo declarado com o tipo Double por inferência (O Kotlin já vai saber de que tipo se trata).

    // saldo = 100 // Se eu tentar colocar um valor inteiro em saldo, o código não compila.
    println("Valor da variável saldo é do tipo Double: $saldo")

    saldo += 100
    // Esse código compila, porque estou usando uma operação aritimética que resulta em um Double.

    println("Valor de saldo depois da operação aritimética com número inteiro: $saldo")


    // var nome // Esse código não compila. No Kotlin toda variável precisa ser inicializada.
    // nome = "Tony" // Mesmo se eu tentar atribuir depois.

    lateinit var nome: String
    // Podemos também declarar uma variável sem precisar inicializá-la, usando "lateinit".
    // Mas não posso usar essa variável, se eu tentar, vai dar erro.

    // println("nome: $nome") // Esse código compila, mas vai dar erro.

    if(conta == 1000) nome = "Tony"

    // "lateinit" é usado para inicializar a variável depois de alguma condição especial.

    println("Valor da variável nome inicializada depois: $nome")

    var titular1 = "Tony"
    titular1 = "Tony Araújo"

    // Exemplo de variáveis mutáveis com "var". Podemos observar que esta variável mudou o valor inicial.

    val titular2 = "Thays"
    // titular2 = "Thays Neves"

    // O Segundo exemplo com "val" a variável não pode ser modificada. Se tirar o comentário do código, não compila.

    println("Valor da variável titular1: $titular1")
    println("Valor da variável titular2: $titular2")

    // Imprimindo o valor das variáveis com a String Template.


}

