package models;

public class FuncionarioMensalista extends Funcionario {
    
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override 
    public double calcularSalario() {
        return getSalarioBase();
    }
}
