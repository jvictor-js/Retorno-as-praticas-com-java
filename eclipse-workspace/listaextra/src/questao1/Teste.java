package questao1;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LojaShopping[] loja = new LojaShopping[3];
		
		for (int i = 0; i < loja.length; i++) {
			LojaShopping l = new LojaShopping();
			System.out.println("--- Loja ---");
			System.out.println("Qual o identificador da loja? ");
			l.identificador = sc.nextLine();
			System.out.println("Qual o CNPJ da loja? ");
			l.cnpj = sc.nextLine();
			System.out.println("Qual a razão social da loja: ");
			l.razaoSocial = sc.nextLine();
			System.out.println("Qual o endereço da loja? ");
			l.setEndereco(sc.nextLine());
			System.out.println("Quem é o gerente da loja? ");
			l.setGerente(sc.nextLine());
			System.out.println("Está aberta? ");
			l.registra_abertura_dia();
			loja[i] = l;
			
		}
		
		for(LojaShopping lojas : loja) {
			lojas.mostrarDadosLoja();
		}
		sc.close();

	}

}
