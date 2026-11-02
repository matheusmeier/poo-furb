package models;

public class Funcionario {

    private int matricula;
    private String nome;
    private double salario;
    private Departamento departamento;

    public Funcionario(int matricula, String nome, double salario, Departamento departamento) {
        setMatricula(matricula);
        setNome(nome);
        setSalario(salario);
        setDepartamento(departamento);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
