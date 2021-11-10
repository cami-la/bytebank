import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.test.testaAny
import br.com.alura.bytebank.test.testaExpressao

fun main() {
    println("início main")

    testaComportamentosConta();

    //funcao1()
    println("fim main")
}


fun funcao1() {
    println("início funcao1")
    try{
        funcao2()
    }catch (e: ClassCastException){
        e.printStackTrace()
        println("SaldoInsuficienteException ClassCastException foi pegada.")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for(i in 1..5){
        println(i)
        val endereco: Any = Any();
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}










