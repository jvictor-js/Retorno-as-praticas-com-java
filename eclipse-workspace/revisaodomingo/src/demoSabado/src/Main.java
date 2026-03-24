import abs.LojaShopping;
import model.Cliente;
import model.Funcionario;
import model.Gerente;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Myriam", "123.456.789-00");
        p1.mostrarDados();

        Cliente c1 = new Cliente("Maria", "987.654.321-00", 123);
        c1.mostrarDados();
        c1.mostrarDadosDeOutraForma();

        Funcionario f1 = new Funcionario("João", "111.222.333-44", "F123", 2500.00);
        f1.mostrarDados();
        f1.mostrarDadosDeOutraForma();

        Gerente g1 = new Gerente("Carlos", "555.666.777-88", "G456", 5000.00, 10);
        g1.mostrarDados();
        g1.mostrarDadosDeOutraForma();

        LojaShopping lojaShopping = new LojaShopping("12.345.678/0001-90", "Loja do Shopping", "Rua Principal, 123", "Ana");
        lojaShopping.mostrarDados();
        lojaShopping.registra_fechamento_dia();
        lojaShopping.registra_abertura_dia();
        lojaShopping.registra_abertura_dia();
        lojaShopping.registra_fechamento_dia();
    }
}