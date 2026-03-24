package maonamassa;
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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Preço inválido.");
		} else {
			this.preco = preco;
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			System.out.println("Quantidade inválida.");
		} else {
			this.quantidade = quantidade;
		}
	}
	
	public void registrarProduto(Scanner sc) {
		System.out.println("--- Registrando produto ---");
		System.out.println("Nome: ");
		setNome(sc.nextLine());
		System.out.println("Informe seu preço: ");
		setPreco(sc.nextDouble());
		System.out.println("Informe a quantidade: ");
		setQuantidade(sc.nextInt());
	}
	
	public double valorTotal() {
			return preco * quantidade;
	}
		
}	

