package herancapolimorfismo;

public class Vendedor extends Funcionario {
	private int numVendas;
	private double comissao;
	
	Vendedor(String nome, double salario, int numVendas, double comissao){
		super(nome, salario);
		this.numVendas = numVendas;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return salario + (numVendas * comissao);
	}
	
}
