package questao5;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String dataNasc;
	
	Pessoa(){}
	
	Pessoa (String nome, String cpf, String dataNasc){
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}
	
	public void jogar() {
		System.out.println("Jogando...");
	}
	
}
