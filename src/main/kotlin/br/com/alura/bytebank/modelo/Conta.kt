package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo: Double = 0.0
        protected set;

    companion object {
        var total = 0
            private set;
    }

    init {
        println("Criando conta")
        total++;
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha);
    }

    fun deposita(valor: Double) {
        if(valor > 0) this.saldo += valor;
    }

    abstract fun saca(valor: Double);

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (this.saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O Saldo é insuficiente. Saldo atual: $saldo, valor a ser subtraído: $valor");
        }
        if(!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor;
        destino.deposita(valor);
    }

}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1;
        if(this.saldo >= valorComTaxa) this.saldo -= valorComTaxa;
    }

}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor)
            this.saldo -= this.saldo - valor;
    }
}