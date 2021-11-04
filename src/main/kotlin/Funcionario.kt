class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    fun bonificacao(): Double {
        return this.salario * 0.1;
    }



}