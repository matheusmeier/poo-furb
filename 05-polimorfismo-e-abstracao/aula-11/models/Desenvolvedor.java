package models;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
       return Math.round(this.getSalarioBase());
    }

    @Override
    public double calcularBonus() {
        return Math.round(this.calcularSalario() * 1.2);
    }
    
}
