package maonamassa;
import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void criarAluno(Scanner sc) {
		System.out.println("--- Criando aluno ---");
		System.out.println("Nome: ");
		setNome(sc.nextLine());
		do {
			System.out.println("Nota: ");
			setNota(sc.nextDouble());
			if (getNota() < 0 || getNota() > 10) {
				System.out.println("Nota inválida!");
			}
		} while (getNota() < 0 || getNota() > 10);
		
	}
	
	public void exibirDados() {
		System.out.println("--- Dados do aluno ---");
		System.out.println("Nome: " + getNome());
		System.out.println("Nota: " + getNota());
	}
	
}
