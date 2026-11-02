package models;

public class Calculadora {

    public Calculadora() {
    }

    public int somar(int numero1, int numero2) {
        return (numero1 + numero2);
    }

    public int subtrair(int numero1, int numero2) {
        return (numero1 - numero2);
    }

    public double multiplicar(double numero1, double numero2) {
        return (numero1 * numero2);
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException();
        }

        return (numero1/numero2);
    }
}
