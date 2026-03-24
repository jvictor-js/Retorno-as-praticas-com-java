package abs;

public class LojaShopping extends Loja implements Registro {

    private String endereco;
    private String gerente;

    public LojaShopping(){
        super();
    }

    public LojaShopping(String cnpj, String razaoSocial, String endereco, String gerente) {
        super(cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public void mostrarDados() {
        System.out.println("- - - INFO Loja Shopping - - - -");
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Gerente: " + this.gerente);
    }

    @Override
    public void registra_abertura_dia() {
        if(isAberta()){
            System.out.println("- - - A Loja do Shopping já está aberta!! - - - -");
        }
        else{
            setAberta(true);
            System.out.println("- - - A Loja do Shopping foi aberta!! - - - -");
        }
    }

    @Override
    public void registra_fechamento_dia() {
        if(!isAberta()){
            System.out.println("- - - A Loja do Shopping já está fechada!! - - - -");
        }
        else {
            setAberta(true);
            System.out.println("- - - A Loja do Shopping foi fechada!! - - - -");
        }
    }
}
