package br.com.alura.bytebank.test

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Aparamento"
        completo()
    }.let { enderecoComplemento -> println(enderecoComplemento) }
}