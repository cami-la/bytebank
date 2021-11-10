package br.com.alura.bytebank.test

fun testaExpressao() {
    val entrada: String = "1.0";

    val valorRecebido: Double? = try {
        entrada.toDouble();
    } catch (e: NumberFormatException) {
        println("Problema na conversão");
        e.printStackTrace();
        null;
    }

    if (valorRecebido != null) {
        println("valor recebido: $valorRecebido");
    } else {
        println("valor inválido")
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1;
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa");
    } else {
        println("valor inválido");
    }
}
