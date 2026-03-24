package aula41;

public abstract class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	protected String cpf;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, String endereco, String telefone, String cpf){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public abstract void imprimirEtiquetaEndereco();
	
}
