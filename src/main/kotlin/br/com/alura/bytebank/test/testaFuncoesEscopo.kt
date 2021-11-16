package br.com.alura.bytebank.test

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua Vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//
//    println(enderecoEmMaiusculo)

    /*Endereco(logradouro = "rua Vergueiro", numero = 3185)
        .let { endereco ->
         "${endereco.logradouro}, ${endereco.numero}".uppercase()
     }.let (::println)*/

    run {
        println("Execução do run sem extensão.")
    }

    Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rua Vergueiro"
            numero = 3185
        }

    val endereco1 = Endereco(logradouro = "rua Vergueiro", numero = 3185)

    with(endereco1) {
        "${this.logradouro}, ${this.numero}".uppercase()
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco -> endereco.complemento?.isNotEmpty() ?: false }
//        .count()
        .let(block = (::println))
}
