class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set;


    fun deposita(valor: Double) {
        if(valor > 0) this.saldo += valor;
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) this.saldo -= valor;
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

}