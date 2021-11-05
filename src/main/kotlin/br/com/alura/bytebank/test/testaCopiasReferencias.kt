import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX: Int = 10;
    var numeroY: Int = numeroX;
    numeroY++;

    println("numeroX $numeroX");
    println("numeroY $numeroY");

    val joao = Cliente(nome = "João", cpf = "333.333.333-33", senha = 3);

    val contaJoao = ContaCorrente(joao, 1002);

    var contaMaria = ContaPoupanca(
        Cliente(
            nome = "Maria",
            cpf = "444.444.444-44",
            senha = 4
        ), 1003
    );

    contaMaria.titular.nome = "Maria";
    contaJoao.titular.nome = "João";

    println("Titular conta João: ${contaJoao.titular}");
    println("Titular conta Maria: ${contaMaria.titular}");

    println(contaJoao);
    println(contaMaria);

}
