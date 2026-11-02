package models;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(3, 0, "]");

       calculadora.calcular(calculadora);
    }
}
