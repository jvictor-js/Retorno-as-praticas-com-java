package maonamassa;

public class Carro {
	String marca;
	String modelo;
	int ano;
	
	Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInfo() {
		System.out.println("--- Exibindo informações ---");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
}
