package questao3;

public class Livro {
	private Titulo titulo;
	private Autor autor;
	private Capitulo capitulo;
	private Editora editora;
	
	Livro(){
		
	}
	
	Livro(Titulo titulo, Autor autor, Capitulo capitulo, Editora editora){
		this.titulo = titulo;
		this.autor = autor;
		this.capitulo = capitulo;
		this.editora = editora;
	}
	
}
