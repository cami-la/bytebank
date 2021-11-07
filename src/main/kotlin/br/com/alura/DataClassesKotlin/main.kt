package br.com.alura.DataClassesKotlin

fun main() {
    val alex: Pessoa = Pessoa(
        nome = "Alex",
        idade = 25
    );
    val alex2: Pessoa = Pessoa(
        nome = "Alex",
        idade = 25
    );
    println(alex == alex2);
    alex.fala();
    println(alex);

    val (nome) = alex;
    println(nome);

    val documento: Documento = Documento(
        rg = "1.234-640",
        cpf = "111.111.111-11");
    val documento2: Documento = documento.copy(rg="1234");

    println(documento == documento2);
    println(documento);
    println(documento2);

    val (rg: String, cpf: String) = documento;
    println("rg: $rg e cpf $cpf");



}

class Pessoa(val nome: String, val idade: Int) {

    fun fala() {
        println("Emite som.")
    }

    operator fun component1() = this.nome;
    operator fun component2() = this.idade;
}

data class Documento(val rg: String, val cpf: String){
    var test = "";
}