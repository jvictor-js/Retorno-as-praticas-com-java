package model;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Código: " + this.codigo);
    }

    public void mostrarDadosDeOutraForma() {
        System.out.println("-- - - INFO DO CLIENTE - - --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Código: " + this.codigo);
    }
}
