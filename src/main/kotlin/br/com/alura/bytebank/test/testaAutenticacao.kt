import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        "111.111.111-11",
        1000.0,
        1000
    );

    val diretora = Diretor(
        nome = "Fran",
        "222.222.222-22",
        1000.0,
        2000,
        200.0
    );

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    );

    val sistema = SistemaInterno();
    sistema.entra(autenticavel = gerente, senha=1000);
    sistema.entra(autenticavel = diretora, senha=2000);
    sistema.entra(autenticavel = cliente, senha = 1234);
}
