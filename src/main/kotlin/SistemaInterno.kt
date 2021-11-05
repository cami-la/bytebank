class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int){
        if(autenticavel.autentica(senha)) println("Bem-vindo ao Bytebank");
        else println("Falha na autenticação")
    }

}