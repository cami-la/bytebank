class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val senha: Int,
              val plr: Double)
    : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr;
        }
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) return true;
        return false;
    }
}