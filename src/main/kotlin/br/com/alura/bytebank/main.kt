import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    /*val palavra: String = "";
    val palavraJava: StringJava = StringJava("");*/

    var totalContas: Int = 0;

    val alex= Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1);
    totalContas++;

    testaContasDiferentes();

    println("Total de contas: ${totalContas}");
}






