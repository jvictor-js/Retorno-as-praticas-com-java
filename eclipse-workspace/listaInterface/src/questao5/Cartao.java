package questao5;

public class Cartao implements Pagamento {
	@Override
	public void pagar(double valor) {
		System.out.println("Pagando com cartão...");
	}
}
