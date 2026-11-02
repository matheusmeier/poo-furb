package models;

public class FuncionarioHorista extends Funcionario{
    
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);

        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override 
    public double calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());
    }
}
