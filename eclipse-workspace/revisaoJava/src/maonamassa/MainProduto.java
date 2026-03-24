package maonamassa;
import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		Produto p2 = new Produto("Picanha", 100.67, 1);
		
		p1.registrarProduto(sc);
		System.out.println(p1.valorTotal());
		System.out.println(p2.valorTotal());
	}

}
