package questao1;

public abstract class Loja {
	
	protected String identificador;
	protected String cnpj;
	protected String razaoSocial;
	protected boolean aberta;
	
	Loja(){}
	
	Loja(String identificador, String cnpj, String razaoSocial){
		this.identificador = identificador;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}

	public void mostrarDadosLoja() {
		System.out.println("--- Dados da Loja ---");
		System.out.println("Identificador: " + identificador);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Razão social: " + razaoSocial);
	}
	
}
