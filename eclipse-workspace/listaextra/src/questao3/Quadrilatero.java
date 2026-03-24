package questao3;

public abstract class Quadrilatero implements Forma {
	protected int tamanhoLados;
	
	Quadrilatero() {
		
	}
	
	Quadrilatero(int tamanhoLados) {
		this.tamanhoLados = tamanhoLados;
	}
	
	@Override
	public int calculoPerimetro(int perimetro) {
		perimetro = tamanhoLados * 4;
		return perimetro;
		
	}
	
}
