package questao2;

public class Computador {
	private String marca;
	private Teclado teclado;
	private Monitor monitor;
	private Memoria memoria;
	private PlacaMae placaMae;
	
	Computador(){
		
	}
	
	Computador(String marca, Teclado teclado, Monitor monitor, Memoria memoria, PlacaMae placaMae){
		this.marca = marca;
		this.teclado = teclado;
		this.monitor = monitor;
		this.memoria = memoria;
		this.placaMae = placaMae;
	}
	
}
