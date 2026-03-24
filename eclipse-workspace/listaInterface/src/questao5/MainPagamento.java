package questao5;

public class MainPagamento {

	public static void main(String[] args) {
		Pagamento p1 = new Cartao();
		Pagamento p2 = new Dinheiro();
		
		p1.pagar(78);
		p2.pagar(90);

	}

}
