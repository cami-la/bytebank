import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "rua Vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//
//    println(enderecoEmMaiusculo)

   Endereco(logradouro = "rua Vergueiro", numero = 3185).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".uppercase()
    }.let (::println)

    val enderecosComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco -> endereco.complemento?.isNotEmpty() ?: false }
//        .count()
        .let(block = (::println))

    soma(1,5, resultado =  {
        resultado ->
        println(resultado)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento.")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a+b)
    println("Depois da soma")
}









