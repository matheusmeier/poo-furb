package models;

public class Uber extends Transporte {
    
    public Uber(double distancia) {
        super(distancia);
    }

    @Override 
    public double calcularCusto() {
        return Math.round(this.getDistancia() * 2);
    }
}
