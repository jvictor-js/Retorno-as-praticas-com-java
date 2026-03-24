package questao2;

public class Automovel extends Veiculo {
	
	public void trocarOleo(float litros) {
		System.out.println("Trocando " + litros + " de óleo.");
	}
	
	@Override
	public float acelerar(float velocidade) { 
		return velocidade + 20;
	}
	
	@Override
	public void parar() {
		System.out.println("Parando automovel...");
	}
	
}
