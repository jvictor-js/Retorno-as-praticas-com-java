package composicao;
import java.util.Scanner;

public class MainCasa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Casa casa = new Casa();
		
		casa.criandoQuartos(sc);
		
		casa.mostrandoQuartos();

	}

}
