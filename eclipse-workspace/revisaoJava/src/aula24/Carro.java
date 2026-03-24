package aula24;
import java.util.Scanner;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	Carro(){
		
	}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}
	
	public void criarCarro(Scanner sc) {
		System.out.println("--- Criando carro ---");
		System.out.println("Informe a marca do carro: ");
		marca = sc.nextLine();
		System.out.println("Informe o modelo do carro: ");
		modelo = sc.nextLine();
		System.out.println("Informe a quantidade de passageiros: ");
		numPassageiros = sc.nextInt();
		System.out.println("Capacidade de combustível: ");
		capCombustivel = sc.nextDouble();
		System.out.println("Consumo de combustível: ");
		consCombustivel = sc.nextDouble();
	}
	
	public void exibirCarro() {
		System.out.println("--- Exibindo carro ---");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Número de passageiros: " + numPassageiros);
		System.out.println("Capacidade de combustível: " + capCombustivel); 
		System.out.println("Consumo de combustível: " + consCombustivel);
		
	}
	
}
