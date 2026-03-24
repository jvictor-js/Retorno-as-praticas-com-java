package herancapolimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario[] f = new Funcionario[4];
		f[0] = new Gerente("João", 600, 50);
		f[1] = new Vendedor("Sam", 700, 7, 50);
		
		for (int i = 0; i < f.length; i++) {
			System.out.println("Salário final: " + f[i].calcularSalario());
		}
	}

}
