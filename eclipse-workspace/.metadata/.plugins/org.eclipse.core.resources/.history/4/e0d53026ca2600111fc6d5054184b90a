package agregacao;
import java.util.Scanner;

public class Escola {
	
	private String nome;
	private Aluno[] alunos = new Aluno[4];
	
	Escola(String nome) {
		this.nome = nome;
	}
	
	public void registrarAlunos(Scanner sc) {
		for(int i = 0; i < alunos.length; i++) {
			Aluno aluno = new Aluno();
			aluno.registrarAluno(sc);
			alunos[i] = aluno;
		}
	}
	
	public void mostrarDados() {
		System.out.println("--- Escola ---");
		System.out.println("Nome da Escola: " + nome);
		for(Aluno aluno : alunos) {
			aluno.mostrarDadosAluno();
		}
	}
	
}
