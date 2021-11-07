package br.com.alura.StringKotlin

fun main(){
    /*val x: Int = 10;
    var y: Int = x;
    y++;

    println(x);
    println(y);

    val p1: Pessoa= Pessoa(nome ="Alex");
    val p2: Pessoa = p1;
    p2.nome = "Fran";
    p1.nome = "Alex";

    println(p1.nome);
    println(p2.nome);*/

    val palavra = "palavra";
    var palavraNova = palavra;
    palavraNova = "palavraNova";

    val substring = palavra.substring(4);

    println(palavra);
    println(palavraNova);
    println(substring);

    for (c in palavra) {
        println(c == 'a');
    }


}

//class Pessoa(var nome: String)