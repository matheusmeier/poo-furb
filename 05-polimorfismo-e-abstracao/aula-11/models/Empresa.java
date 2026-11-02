package models;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Funcionario> funcionarios;
    private double custoSalarios;

    public Empresa(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = new ArrayList<>();

        setFuncionarios(funcionarios);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(Funcionario funcionario) {
        this.getFuncionarios().add(funcionario);
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.getFuncionarios().addAll(funcionarios);
    }

    public void calcularCustoSalarios() { 

        this.custoSalarios = 0;

        for (Funcionario funcionario: funcionarios) {
            this.custoSalarios += funcionario.calcularSalario();
        }

        System.out.printf("O custo total da empresa com salários é de: R$%.2f%n", 
        this.custoSalarios);
    }
}
