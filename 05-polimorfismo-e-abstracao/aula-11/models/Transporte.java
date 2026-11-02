package models;

public abstract class Transporte {
    
    private double distancia;

    public Transporte(double distancia) {
        setDistancia(distancia);
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public abstract double calcularCusto();
}
