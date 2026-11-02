package models;

public abstract class Veiculo {

    private String modelo;
    private double valor;

    public Veiculo(String modelo, double valor) {
        setModelo(modelo);
        setValor(valor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void acelerar();
    public abstract double calcularImposto();
}
