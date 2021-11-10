import br.com.alura.bytebank.modelo.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco("Rua do Vergueiro", complemento="casa");

    val logradouroNovo: String? = enderecoNulo?.logradouro

    enderecoNulo?.let {
        println(it.logradouro.length);
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalArgumentException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("");
    teste(1);
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int;
    println(numero);
}












