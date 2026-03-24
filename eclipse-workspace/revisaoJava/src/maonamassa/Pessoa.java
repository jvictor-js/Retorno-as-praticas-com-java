package maonamassa;
import java.util.Scanner;

public class Pessoa {
	String nome;
	int idade;
	
	public void criarPessoa(Scanner sc) { 
		System.out.println("--- Criando Pessoa ---");
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
	}
	
	public void exibirDados() {
		System.out.println("--- Exibindo dados ---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
