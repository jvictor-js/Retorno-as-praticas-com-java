package associacao;
import java.util.Scanner;

public class MainLivro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Leitor leitor = new Leitor("João Victor");
		
		leitor.livrosLidos(sc);
		
		leitor.dadosLeitor(sc);

	}

}
