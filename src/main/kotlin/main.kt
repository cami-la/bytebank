fun main() {
    println("Bem-vindo ao Bytebank");

    val contaAlex: Conta = Conta(titular = "Alex", numero = 1000);
    contaAlex.deposita(200.0);
    println(contaAlex.saldo);

    val contaFran: Conta = Conta(titular = "Fran", numero = 1001);
    contaFran.deposita(300.0);
    println(contaFran.saldo);

    val contaMaria: Conta = Conta("Maria", 1002);
    contaFran.deposita(300.0);
    println(contaFran.saldo);

    val contaJoao: Conta = Conta("João", 1003);
    contaFran.deposita(300.0);
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
    if(contaFran.transfere(100.0, contaAlex)) println("Transferência sucedida!");
    else println("Falha na transferência.")
    println(contaFran.saldo);
    println(contaAlex.saldo);
    println("---")
    println(contaFran.saldo);
    println(contaAlex.saldo);
    println("Transferência Alex -> Fran");
    if(contaAlex.transfere(300.0, contaFran)) println("Transferência sucedida!");
    else println("Falha na transferência.")
    println(contaFran.saldo);
    println(contaAlex.saldo);


}


class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set;


    fun deposita(valor: Double) {
        if(valor > 0) this.saldo += valor;
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) this.saldo -= valor;
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

}

fun testaCopiasEReferencias() {
    val numeroX: Int = 10;
    var numeroY: Int = numeroX;
    numeroY++;

    println("numeroX $numeroX");
    println("numeroY $numeroY");

   /* val contaJoao: Conta = Conta();
    contaJoao.titular = "João";
    var contaMaria: Conta = Conta();

    contaMaria.titular = "Maria";

    println("Titular conta João: ${contaJoao.titular}");
    println("Titular conta Maria: ${contaMaria.titular}");

    println(contaJoao);
    println(contaMaria);*/

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