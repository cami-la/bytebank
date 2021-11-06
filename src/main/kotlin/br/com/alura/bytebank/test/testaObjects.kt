package br.com.alura.bytebank.test

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    /*val palavra: String = "";
    val palavraJava: StringJava = StringJava("");*/

    val fran = object : Autenticavel {
        val nome: String = "Fran";
        val cpf: String = "111.111.111-..";
        val senha: Int = 10000

        override fun autentica(senha: Int) = this.senha == senha;
    }

    val sistemaInterno = SistemaInterno();
    sistemaInterno.entra(autenticavel = fran, senha = 10000);

    println("Nome do cliente ${fran.nome}");

    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1
    );
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000);
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001);

    println("Total de contas: ${Conta.total}");
}
