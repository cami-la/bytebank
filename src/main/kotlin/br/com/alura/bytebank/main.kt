import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    );
    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    );

    println(endereco.equals(enderecoNovo));
    println("---");
    println(enderecoNovo.hashCode());
    println(endereco.hashCode());
    println("---");
    println(endereco.toString());
    println(enderecoNovo.toString());
    println("---");
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}");

}

fun imprime(valor: Any): Any {
    println(valor);
    return valor;
}








