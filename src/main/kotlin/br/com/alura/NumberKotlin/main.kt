package br.com.alura.NumberKotlin


fun main(){
    val x: Int = 15;
    val y: Double = 10.0;
    var z = x;

    z+=10;

    teste(x);
    teste(y);
    println("---");
    teste(z);
    teste(x);
    println("---");

}

fun teste(valor: Number) {
    println(valor);
}