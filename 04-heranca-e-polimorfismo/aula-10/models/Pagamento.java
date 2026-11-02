package models;

public abstract class Pagamento {
    
    private double valor;

    public Pagamento(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularValorFinal();
    
}
