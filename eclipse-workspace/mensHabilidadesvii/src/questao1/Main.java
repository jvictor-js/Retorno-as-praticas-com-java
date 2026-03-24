package questao1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LojaShopping loja1 = new LojaShopping();
		LojaShopping loja2 = new LojaShopping();
		LojaShopping loja3 = new LojaShopping();
		
		loja1.cadastrarLoja(sc);
		loja1.registra_abertura_dia();
		loja1.mostrarDados();
		loja1.registra_fechamento_dia();
		
		loja2.cadastrarLoja(sc);
		loja2.registra_abertura_dia();
		loja2.mostrarDados();
		loja2.registra_fechamento_dia();
		
		loja3.cadastrarLoja(sc);
		loja3.registra_abertura_dia();
		loja3.mostrarDados();
		loja3.registra_fechamento_dia();
	}

}
