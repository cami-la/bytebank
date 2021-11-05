open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    open val bonificacao: Double get() {
        println("bonificação funcionário");
        return this.salario * 0.1;
    }



}