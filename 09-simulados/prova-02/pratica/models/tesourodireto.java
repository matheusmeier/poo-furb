//Matheus Hermann Starke Meier

package models;

public class TesouroDireto implements Ativo {
    
    public double valor;
    public double rentabilidade;

    public TesouroDireto(double valor, double rentabilidade) {
        setValor(valor);
        setRentabilidade(rentabilidade);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor está incorreto");
        }

        this.valor = valor;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        if (rentabilidade <= 0) {
            throw new IllegalArgumentException("Valor para o campo rentabilidade está incorreto");
        }

        this.rentabilidade = rentabilidade;
    }

    

    @Override 
    public double calcularRendimento() {
        return (this.getValor() * (this.getRentabilidade())/100);
    }

    @Override 
    public double calcularValorInvestido() {
        return (this.getValor());
    }
    
}
