package questao1;
import java.util.Scanner;

public class LojaShopping extends Loja implements Registro{
	
	private String endereco;
	private String gerente;
	
	LojaShopping(){}
	
	LojaShopping(String identificador, String cnpj, String razaoSocial, String endereco, String gerente){
		super(identificador, cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}



	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Endereço: " + endereco);
		System.out.println("Gerente: " + gerente);
	}
	
	public void registra_abertura_dia() {
		if (aberta) {
			System.out.println("A loja já está aberta.");
		} else {
			aberta = true;
			System.out.println("A loja foi aberta.");
		}
	}
	
	public void registra_fechamento_dia() {
		if (aberta) {
			aberta = false;
			System.out.println("A loja foi fechada.");
		} else {
			System.out.println("A loja já está fechada.");
		}
	}
	
	public void cadastrarLoja(Scanner sc) {
		System.out.println("--- Cadastrando loja ---");
		System.out.println("Informe o identificador da loja: ");
		identificador = sc.nextLine();
		System.out.println("Informe o CNPJ: ");
		cnpj = sc.nextLine();
		System.out.println("Informe a razão social: ");
		razaoSocial = sc.nextLine();
		System.out.println("Informe o endereço: ");
		endereco = sc.nextLine();
		System.out.println("Informe o gerente: ");
		gerente = sc.nextLine();
	}
	
}
