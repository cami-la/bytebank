fun testaCopiasEReferencias() {
    val numeroX: Int = 10;
    var numeroY: Int = numeroX;
    numeroY++;

    println("numeroX $numeroX");
    println("numeroY $numeroY");

    val contaJoao = ContaCorrente("João", 1002);
     contaJoao.titular = "João";

     var contaMaria = ContaPoupanca("Maria", 1003);
     contaMaria.titular = "Maria";

     println("Titular conta João: ${contaJoao.titular}");
     println("Titular conta Maria: ${contaMaria.titular}");

     println(contaJoao);
     println(contaMaria);

}
