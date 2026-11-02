package models;

public class Vendedor extends Funcionario {
    
    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void registrarVenda(double valor) {
        System.out.printf("%s fez uma venda de R$%.2f.%n",
                                    this.getNome(),
                                    valor
        );
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return Math.round(this.calcularSalario() * 1.1);
    }
}
