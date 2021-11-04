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
    println("bonificação ${alex.bonificacao}");
    println("----");

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 4000.0,
        senha = 1234
    );
    println("nome ${fran.nome}");
    println("cpf ${fran.cpf}");
    println("salario ${fran.salario}");
    println("bonificação ${fran.bonificacao}");
    if (fran.autentica(senha = 1234)) println("Autenticou com sucesso.");
    else println("Falha na autenticação.");
    println("----");

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1235,
        plr = 200.0
    );
    println("nome ${gui.nome}");
    println("cpf ${gui.cpf}");
    println("salario ${gui.salario}");
    println("bonificação ${gui.bonificacao}");
    println("plr ${gui.plr}");

    if (gui.autentica(senha = 1235)) println("Autenticou com sucesso.");
    else println("Falha na autenticação.");

}



