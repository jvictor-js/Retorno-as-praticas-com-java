package model;

public class Funcionario extends Pessoa {

    protected String matricula;
    protected double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String matricula, double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Salário $ " + this.salario);
    }

    public void mostrarDadosDeOutraForma() {
        System.out.println("-- - - INFO DO FUNCIONÁRIO - - --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Salário $ " + this.salario);
    }
}
