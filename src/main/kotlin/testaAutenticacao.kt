fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        "111.111.111-11",
        1000.0,
        1000
    );

    val diretora = Diretor(
        nome = "Fran",
        "222.222.222-22",
        1000.0,
        2000,
        200.0
    );

    var cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    );

    val sistema = SistemaInterno();
    sistema.entra(funcionarioAdmin = gerente, senha = 1000);
    sistema.entra(funcionarioAdmin = diretora, senha = 1000);
    sistema.entra(funcionarioAdmin = diretora, senha = 1000);
}
