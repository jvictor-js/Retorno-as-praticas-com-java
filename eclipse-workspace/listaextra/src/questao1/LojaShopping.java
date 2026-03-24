package questao1;

public class LojaShopping extends Loja implements Registro{
	private String endereco;
	private String gerente;
	
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

	LojaShopping(){
		
	}
	
	LojaShopping(String identificador, String cnpj, String razaoSocial, String endereco, String gerente){
		super(identificador, cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}
	
	@Override
	public void mostrarDadosLoja() {
		super.mostrarDadosLoja();
		System.out.println("Está aberta? " + aberta);
		System.out.println("Endereço: " + endereco);
		System.out.println("Gerente: " + gerente);
	}
	
	public void registra_abertura_dia () {
		if(aberta) {
			System.out.println("A loja já está aberta.");
		} else {
			aberta = true;
			System.out.println("A loja está aberta.");
		}
	}
	
	public void registra_fechamento_dia() {
		if (aberta) {
			aberta = false;
			System.out.println("A loja está fechada.");
		} else {
			System.out.println("A loja já está fechada.");
		}
	}
	
}
