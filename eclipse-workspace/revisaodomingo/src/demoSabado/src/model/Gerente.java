package model;

public class Gerente extends Funcionario{

    private int area;

    public  Gerente(){
        super();
    }

    public Gerente(String nome, String cpf, String matricula, double salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Área: " + this.area);
    }

    @Override
    public void mostrarDadosDeOutraForma() {
        System.out.println("-- - - INFO DO GERENTE - - --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Salário $ " + this.getSalario());
        System.out.println("Área: " + this.area);
    }

}
