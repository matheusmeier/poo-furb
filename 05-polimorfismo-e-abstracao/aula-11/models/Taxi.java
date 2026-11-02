package models;

public class Taxi extends Transporte {
    
    public Taxi(double distancia) {
        super(distancia);
    }

    @Override 
    public double calcularCusto() {
        return Math.round(this.getDistancia() * 3);
    }
}
