package questao2;

public class Bicicleta extends Veiculo{

	@Override
	public float acelerar(float velocidade) { 
		return velocidade + 5;
	}
	
	@Override
	public void parar() {
		System.out.println("Parando bicicleta...");
	}
	
}
