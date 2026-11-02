package models;

public class ContaBancaria {
    
    int numeroConta;
    String titular;
    public double saldo;


    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException();
        }

        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException();
        }

        else if (saldo > this.saldo) {
            throw new NumberFormatException();
        }

        this.saldo -= saldo;
    }

    public void consultarSaldo() {
        System.out.println("---------------------");
        System.out.printf("Número: %d%n", this.numeroConta);
        System.out.printf("Titular: %s%n", this.titular);
        System.out.printf("Saldo: R$%.2f%n", this.saldo);
        System.out.println("---------------------");
    }


}
