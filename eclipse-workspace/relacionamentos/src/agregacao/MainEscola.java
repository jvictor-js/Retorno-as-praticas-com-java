package agregacao;
import java.util.Scanner;

public class MainEscola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Escola escola = new Escola("UEPB");
		
		escola.registrarAlunos(sc);
		
		escola.mostrarDados();

	}

}
