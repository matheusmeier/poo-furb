package models;

public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);

        setBase(base);
        setAltura(altura);
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
        return (getBase() * getAltura())/2;
    }
}