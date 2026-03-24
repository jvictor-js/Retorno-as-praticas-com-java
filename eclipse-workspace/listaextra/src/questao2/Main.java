package questao2;

public class Main {

	public static void main(String[] args) {
		
		Veiculo bicicleta = new Bicicleta();
		Veiculo automovel = new Automovel();
		Automovel automovel2 = new Automovel();
		
		System.out.println(bicicleta.acelerar(56));
		bicicleta.parar();
		
		System.out.println(automovel.acelerar(89));
		automovel.parar();
		
		automovel2.trocarOleo(7);
		

	}

}
