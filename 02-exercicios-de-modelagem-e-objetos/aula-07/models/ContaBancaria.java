package models;

public class ContaBancaria {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente correntista;

    public ContaBancaria(int numero, int agencia, double saldo, Cliente correntista) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCorrentista() {
        return this.correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }


    
}
