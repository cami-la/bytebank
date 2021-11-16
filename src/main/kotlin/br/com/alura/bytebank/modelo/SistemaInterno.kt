package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(autenticavel.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
            autenticado()
        };
        else println("Falha na autenticação")
    }

    fun entraReceiver(autenticavel: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(autenticavel.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
            autenticado()
        };
        else println("Falha na autenticação")
    }

    fun pagamento(){
        print("Realizando pagamento")
    }

}