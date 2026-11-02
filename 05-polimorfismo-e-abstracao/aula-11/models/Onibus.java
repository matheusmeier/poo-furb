package models;

public class Onibus extends Transporte {
    
    public Onibus(double distancia) {
        super(distancia);
    }

    @Override 
    public double calcularCusto() {
        return Math.round(this.getDistancia() * 1.5);
    }
}
