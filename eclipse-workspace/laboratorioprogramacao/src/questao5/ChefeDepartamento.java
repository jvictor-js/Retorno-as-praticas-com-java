package questao5;

public class ChefeDepartamento extends Funcionario{
	private String departamento;
	private String dataPromocao;
	private double gratificacao;
	
	ChefeDepartamento(){}

	ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao){
		super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
		this.departamento = departamento;
		this.dataPromocao = dataPromocao;
		this.gratificacao = gratificacao;
	}
	
	public void darOrdem() {
		System.out.println("Realize seu trabalho!");
	}
	
}