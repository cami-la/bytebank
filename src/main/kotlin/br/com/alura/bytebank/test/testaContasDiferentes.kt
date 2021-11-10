import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {


    val contaCorrente = ContaCorrente(Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1,
        endereco = Endereco(logradouro="Rua Vergueiro")
    ), numero = 1000);

    println("=== Titular ===");
    println("Titular: ${contaCorrente.titular.nome}")
    println("CPF: ${contaCorrente.titular.cpf}");
    println("Logradouro: ${contaCorrente.titular.endereco.logradouro}");

    val contaPoupanca = ContaPoupanca(titular = Cliente(
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 1
    ), numero = 1002);

    contaCorrente.deposita(valor = 1000.0);
    contaPoupanca.deposita(valor = 1000.0);

    println("Saldo corrente ${contaCorrente.saldo}");
    println("Saldo Poupança ${contaPoupanca.saldo}");

    contaCorrente.saca(100.0);
    contaPoupanca.saca(100.0);

    println("Saldo corrente após saque: ${contaCorrente.saldo}");
    println("Saldo Poupança após saque: ${contaPoupanca.saldo}");

    println("---")
    //contaCorrente.transfere(100.0, contaPoupanca);
    println("Saldo corrente após transferir: ${contaCorrente.saldo}");
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}");

    //contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo poupança após transferir: ${contaPoupanca.saldo}");
    println("Saldo corrente após receber transferência: ${contaCorrente.saldo}");
}
