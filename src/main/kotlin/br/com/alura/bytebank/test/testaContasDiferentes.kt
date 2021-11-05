import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000);

    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001);

    contaCorrente.deposita(valor = 1000.0);
    contaPoupanca.deposita(valor = 1000.0);

    println("Saldo corrente ${contaCorrente.saldo}");
    println("Saldo Poupança ${contaPoupanca.saldo}");

    contaCorrente.saca(100.0);
    contaPoupanca.saca(100.0);

    println("Saldo corrente após saque: ${contaCorrente.saldo}");
    println("Saldo Poupança após saque: ${contaPoupanca.saldo}");

    println("---")
    contaCorrente.transfere(100.0, contaPoupanca);
    println("Saldo corrente após transferir: ${contaCorrente.saldo}");
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}");

    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo poupança após transferir: ${contaPoupanca.saldo}");
    println("Saldo corrente após receber transferência: ${contaCorrente.saldo}");
}
