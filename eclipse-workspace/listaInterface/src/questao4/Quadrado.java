package questao4;

public class Quadrado implements Forma{
	private double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
}
