fun main() {
    println("Bem-vindo ao Bytebank");

    val contaAlex: Conta = Conta();
    contaAlex.titular = "Alex";
    contaAlex.numero = 1000;
    contaAlex.saldo = 200.0;

    val contaFran: Conta = Conta();
    contaFran.titular = "Fran";
    contaFran.numero = 1001;
    contaFran.saldo = 300.0;

    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.saldo);
    println(contaFran.titular);
    println(contaFran.numero);
    println(contaFran.saldo);
    println("--------")
    println(contaAlex.saldo);
    println("Depositando na conta do Alex");
    deposita(contaAlex, 50.0);
    println(contaAlex.saldo);

    println(contaFran.saldo);
    println("Depositando na conta da Fran");
    deposita(contaFran, 70.0);
    println(contaFran.saldo);


}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor;
}

class Conta {
    var titular: String = "";
    var numero: Int = 0;
    var saldo: Double = 0.0;

    /*fun deposita(valor: Double){
        this.saldo += valor;
    }*/
}

fun testaCopiasEReferencias() {
    val numeroX: Int = 10;
    var numeroY: Int = numeroX;
    numeroY++;

    println("numeroX $numeroX");
    println("numeroY $numeroY");

    val contaJoao: Conta = Conta();
    contaJoao.titular = "João";
    var contaMaria: Conta = Conta();

    contaMaria.titular = "Maria";

    println("Titular conta João: ${contaJoao.titular}");
    println("Titular conta Maria: ${contaMaria.titular}");

    println(contaJoao);
    println(contaMaria);

}

fun testaCondicoes(saldo: Double) {
    /*if (saldo > 0.0) {
    println("Conta é positiva!");
} else if (saldo == 0.0) {
    println("Conta é neutra!");
} else {
    println("Conta é negativa!")
}
*/
    when {
        saldo > 0.0 -> println("Conta positiva!");
        saldo == 0.0 -> println("Conta neutra!");
        else -> println("Conta negativa!");
    }
}

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