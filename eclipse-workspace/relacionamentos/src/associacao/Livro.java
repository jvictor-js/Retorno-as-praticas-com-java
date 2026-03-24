package associacao;
import java.util.Scanner;

public class Livro {
	
	private String titulo;
	private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void registrarLivro(Scanner sc) {
		System.out.println("--- Registrando livro ---");
		System.out.println("Nome do livro: ");
		titulo = sc.nextLine();
		System.out.println("Autor: ");
		autor = sc.nextLine();
	}
	
}
