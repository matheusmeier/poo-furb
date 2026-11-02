package models;

public class Circulo extends Figura{
    
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override 
    public double calcularArea() {
        return Math.round(3.14 * Math.pow(this.getRaio(), 2));
    }
    
}
