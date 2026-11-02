package models;

public class Consultor extends Funcionario {
    
    private double salarioConsultoria;

    public Consultor(String nome, double salarioBase, double salarioConsultoria) {
        super(nome, salarioBase);

        setSalarioConsultoria(salarioConsultoria);
    }

    public double getSalarioConsultoria() {
        return this.salarioConsultoria;
    }

    public void setSalarioConsultoria(double salarioConsultoria) {
        this.salarioConsultoria = salarioConsultoria;
    }

    @Override
    public double calcularSalario() {
        return Math.round(getSalarioBase() + getSalarioConsultoria());
    }
}
