package questao1;
import java.util.Scanner;
public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	Produto(){
		
	}
	
	Produto(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}	
	
	public void adicionarUnidades(Scanner sc) {
		System.out.println("--- Adicionando unidades ---");
		System.out.println("Informe o nome do item que você quer adicionar: ");
		nome = sc.nextLine();
		System.out.println("Informe o preço: ");
		preco = sc.nextDouble();
		System.out.println("Informe a quantidade: ");
		quantidade = sc.nextInt();
	}
	
	public void valorEmEstoque() {
		double valorEstoque;
		
	}
	
}
