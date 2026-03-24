package questao5;

public class Aluno extends Pessoa {
	private String matricula;
	
	Aluno(){}
	
	Aluno(String nome, String cpf, String dataNasc, String matricula){
		super(nome, cpf, dataNasc);
		this.matricula = matricula;
	}
	
	public void estudar() {
		System.out.println("Estudando...");
	}
	
}
