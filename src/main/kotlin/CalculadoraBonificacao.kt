class CalculadoraBonificacao {

    var total: Double = 0.0
        private set;

    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}");
        this.total += funcionario.bonificacao;
    }

}