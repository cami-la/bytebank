fun main() {
    println("Bem-vindo ao Bytebank");

    var alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    );

    println("nome ${alex.nome}");
    println("cpf ${alex.cpf}");
    println("salario ${alex.salario}");
    println("bonificação ${alex.bonificacao()}");

    val fran = Gerente(
      nome = "Fran",
      cpf= "222.222.222-22",
      salario = 4000.0,
        senha = 1234
    );

    println("nome ${fran.nome}");
    println("cpf ${fran.cpf}");
    println("salario ${fran.salario}");
    println("bonificação ${fran.bonificacao()}");

    if (fran.autentica(senha=124)) println("Autenticou com sucesso.");
    else println("Falha na autenticação.")

}



