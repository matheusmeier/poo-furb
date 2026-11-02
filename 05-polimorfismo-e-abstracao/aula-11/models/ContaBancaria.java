package models;

public abstract class ContaBancaria {

    private static int contador;
    private int numero;
    private double saldo;

    public ContaBancaria(double saldo) {
        setNumero(++contador);
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void transferir(ContaBancaria destino, double saldo) {
        this.sacar(saldo);

        destino.depositar(saldo);
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

}
