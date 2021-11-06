package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set;

    companion object {
        var total = 0
            private set;
    }

    init {
        total++;
    }

    fun deposita(valor: Double) {
        if(valor > 0) this.saldo += valor;
    }

    abstract fun saca(valor: Double);

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
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