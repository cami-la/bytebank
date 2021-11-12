import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.test.testaNullable

fun main() {
    val minhaFuncao: () -> Unit = fun (){
        println("Executa com lambda")
    }
    println(minhaFuncao)

    val minhaFuncaoAnonima: () -> Unit = fun(){
        println("Executa como função anônima")
    }
    println(minhaFuncaoAnonima)

}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    print(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }

}









