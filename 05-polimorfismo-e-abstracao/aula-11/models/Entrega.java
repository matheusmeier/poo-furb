package models;

public abstract class Entrega {

    private double peso;
    private double distancia;

    public Entrega(double peso, double distancia) {
        setPeso(peso);;
        setDistancia(distancia);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public abstract double calcularFrete();

}
