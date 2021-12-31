package com.tony.fundamentos

/*

    Classe de dados: automaticamente o compilador já faz a implementação dos métodos
    equals(), hashCode() e toSgring(), mas somente para as variáveis declaradas no construtor padrão.

    Uma facilidade que o data class trás é quando temos aquele tipo de classe que sempre vai possuir,
    apenas as variáveis dentro do construtor padrão.

    Tem comportamentos peculiar:
        * componentN: usado para decomposição das variáveis. (Destructuring Declarations). componentN porque ele pega
        as variáveis pela ordem que elas se encontram no construtor padrão. Abaixo exemplos.

        * Copy: serve para criar uma cópia de outra instância de uma classe.
        Obs: É útil nos casos onde pegamos um objeto do banco com a finalidade de fazer um update. Que nesse caso
        trocaríamos apenas alguns atributos e devolveríamos para o banco.

    Regras:

    1: Temos que ter pelo menos uma variável declarada no construtor padrão.
    2: Todas as variáveis do construtor padrão deverão ser val ou var.
    3: Não poderá ser uma classe abstrata, open, sealed ou inner.

*/

fun main() {
    val pessoa = NovaPessoa(nome = "Tony", idade = 42)
    println(pessoa)

    // Usando o Destructuring.

    val (nome, idade) = pessoa

    println("Valor isolado do variável nome: $nome")
    println("Valor isolado do variável idade: $idade")

    // Mesmo não sendo um data class eu consigo fazer o destructing.

    val documento = NovoDocumento(rg = "1234-9", cpf = "111.111.111-9")
    val (rg, cpf) = documento

    println("Valor isolado do variável rg: $rg")
    println("Valor isolado do variável cpf: $cpf")

}

data class NovaPessoa(val nome: String, val idade: Int)

class  NovoDocumento(private val rg: String, private val cpf: String) {
    // Usando data class não haveria a necessidade de usar esse tipo de destructing.
    operator fun component1() = this.rg
    operator fun component2() = this.cpf
}