package maonamassa;
import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		p.criarPessoa(sc);
		p.exibirDados();

	}

}
