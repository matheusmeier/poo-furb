package models;

public class GerenteQ5 extends FuncionarioQ5 {
    
    private double bonus;

    public GerenteQ5(String nome, double salario, double bonus) {
        super(nome, salario);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalarioTotal() {
        return (getSalario() + getBonus());
    }
    
}
