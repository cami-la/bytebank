fun testaComportamentosConta() {
    val contaAlex: Conta = Conta(titular = "Alex", numero = 1000);
    contaAlex.deposita(200.0);
    println(contaAlex.saldo);

    val contaFran: Conta = Conta(titular = "Fran", numero = 1001);
    contaFran.deposita(300.0);
    println(contaFran.saldo);

    val contaMaria: Conta = Conta("Maria", 1002);
    contaMaria.deposita(300.0);
    println(contaFran.saldo);

    val contaJoao: Conta = Conta("João", 1003);
    contaJoao.deposita(300.0);
    println(contaFran.saldo);


    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.saldo);
    println(contaFran.titular);
    println(contaFran.numero);
    println(contaFran.saldo);
    println("--------")
    println(contaAlex.saldo);
    println("Depositando na conta do Alex");
    contaAlex.deposita(50.0);
    println(contaAlex.saldo);
    println(contaFran.saldo);
    println("Depositando na conta da Fran");
    contaFran.deposita(70.0);
    println(contaFran.saldo);

    println("--------")
    println("--------")
    println("Sacando na conta do Alex");
    contaAlex.saca(250.0);
    println(contaAlex.saldo);
    println("Depositando na conta da Fran");
    contaFran.saca(100.0);
    println(contaFran.saldo);
    println("--------")
    println("--------")
    println("Saque em excesso conta Alex");
    contaAlex.saca(100.0);
    println(contaAlex.saldo);
    println("Saque em excesso conta Fran");
    contaAlex.saca(500.0);
    println(contaFran.saldo);
    println("--------")
    println("--------")

    println(contaFran.saldo);
    println(contaAlex.saldo);
    println("Transferência Fran -> Alex");
    if (contaFran.transfere(100.0, contaAlex)) println("Transferência sucedida!");
    else println("Falha na transferência.")
    println(contaFran.saldo);
    println(contaAlex.saldo);
    println("---")
    println(contaFran.saldo);
    println(contaAlex.saldo);
    println("Transferência Alex -> Fran");
    if (contaAlex.transfere(300.0, contaFran)) println("Transferência sucedida!");
    else println("Falha na transferência.")
    println(contaFran.saldo);
    println(contaAlex.saldo);
}
