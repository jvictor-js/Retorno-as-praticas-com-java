package maonamassa;
import java.util.Scanner;

public class Empresa {
	Funcionario[] funcionarios = new Funcionario[3];
	
	public void adicionarFuncionario(Scanner sc) {
		for (int i = 0; i < funcionarios.length; i++) {
			Funcionario f = new Funcionario();
			
			f.registrandoFuncionario(sc);
			
			System.out.println("Informe a % de aumento: ");
			double porcentagem = sc.nextDouble();
			sc.nextLine();
			
			f.aumentarSalario(porcentagem);
			
			funcionarios[i] = f;
		}
	}
	
	public void listarFuncionarios() {
		for(int i = 0; i < funcionarios.length; i++) {
			funcionarios[i].exibindoFuncionario();
		}
	}
}
