package models;

public class Retangulo extends FormaGeometrica{

    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);

        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override 
    public double calcularArea() {
        return (getLargura() * getAltura());
    }
    
}
