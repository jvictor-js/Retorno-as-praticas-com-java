package maonamassa;
import java.util.Scanner;

public class MainEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empresa ep = new Empresa();
		
		ep.adicionarFuncionario(sc);
		ep.listarFuncionarios();

	}

}
