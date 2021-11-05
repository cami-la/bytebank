class SistemaInterno {

    fun entra(senha: Int, funcionarioAdmin: FuncionarioAdmin){
        if(funcionarioAdmin.autentica(senha)) println("Bem-vindo ao Bytebank");
        else println("Falha na autenticação")
    }

}