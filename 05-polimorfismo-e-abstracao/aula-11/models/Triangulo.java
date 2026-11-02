package models;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double largura) {
        setBase(base);
        setAltura(largura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override 
    public double calcularArea() {
        return Math.round((this.getBase() * this.getAltura())/2);
    }

}
