fun testaCondicoes(saldo: Double) {
    /*if (saldo > 0.0) {
    println("br.com.alura.bytebank.modelo.Conta é positiva!");
} else if (saldo == 0.0) {
    println("br.com.alura.bytebank.modelo.Conta é neutra!");
} else {
    println("br.com.alura.bytebank.modelo.Conta é negativa!")
}
*/
    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta positiva!");
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta neutra!");
        else -> println("br.com.alura.bytebank.modelo.Conta negativa!");
    }
}
