package questao3;

public class Conta {
	
	protected String nomeTitular;
	protected String tipoConta;
	protected double saldo;
	
	Conta(){}
	
	Conta(String nomeTitular, String tipoConta, double saldo){
		this.nomeTitular = nomeTitular;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}
	
	public void sacar(double saque) {
		if (saldo <= 0) {
			System.out.println("Impossível sacar! Deposite primeiro.");
		} else if (saque > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo -= saque;
			System.out.println("Saldo atual: " + saldo);
		}
	}
	
	public void depositar(double deposito) {
		if (deposito <= 0 ) {
			System.out.println("Depósito inválido.");
		} else {
			saldo += deposito;
			System.out.println("Saldo atual: " + saldo);
		}
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + nomeTitular);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Saldo: " + saldo);
	}
	
}
