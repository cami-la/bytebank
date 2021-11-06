fun testaLooping() {
    var i: Int = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo: Double = i + 10.0;
//    saldo = 100 + 2.0;
//    saldo += 200;
//    saldo -= 1000;

        println("titular $titular");
        println("Numero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }

    /*for (i in 5 downTo 1) {
        if (i == 4) continue;

        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo: Double = i + 10.0;
//    saldo = 100 + 2.0;
//    saldo += 200;
//    saldo -= 1000;

        println("titular $titular");
        println("Numero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
    };*/
}