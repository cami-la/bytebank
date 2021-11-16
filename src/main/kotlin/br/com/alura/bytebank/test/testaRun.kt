package br.com.alura.bytebank.test

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca
        .run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal -> println("Rendimento mensal $rendimentoMensal") }

    val redimentoAnual: Double = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento anual $redimentoAnual")
}
