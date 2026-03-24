package composicao;
import java.util.Scanner;

public class Casa {
	
	private Quarto[] quartos = new Quarto[3];
	
	public void criandoQuartos(Scanner sc) {
		System.out.println("--- Criando Quartos ---");
		for (int i = 0; i < quartos.length; i++) {
			Quarto quarto = new Quarto();
			System.out.println("Informe o nome do quarto: ");
			String nome = sc.nextLine();
			quarto.setNome(nome);
			quartos[i] = quarto;
		}
	}
	
	public void mostrandoQuartos() {
		System.out.println("--- Quartos ---");
		for(Quarto quarto : quartos) {
			System.out.println(quarto.getNome());
		}
	}
	
}
