package models;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return Math.round(this.getSalarioBase());
    }

    @Override
    public double calcularBonus() {
       return Math.round(this.calcularSalario() * 1.1);
    }
    


}
