package associacao;

public class Main {

	public static void main(String[] args) {
		Professor p = new Professor("Francileudo", "Laboratório de programação");
		
		Aluno a = new Aluno("João Victor", "20473249249", p);
		
		a.mostraDados();

	}

}
