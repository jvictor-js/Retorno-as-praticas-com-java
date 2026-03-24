package aula36;

public class MainContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Jv");
		//contato.setEndereco("oahfoiefoiefihio");
		//contato.setTelefone("58698647967");
		
		Endereco end = new Endereco();
		end.setNomeRua("Janduy");
		end.setNumero(143);
		end.setComplemento("-");
		end.setCidade("Coremas");
		end.setEstado("Paraíba");
		
		contato.setEndereco(end);
		
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("83");
		tel.setNumero("679689");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Celular");
		tel2.setDdd("3654");
		tel2.setNumero("2745535757");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco());
		System.out.println(contato.getTelefones());

	}

}
