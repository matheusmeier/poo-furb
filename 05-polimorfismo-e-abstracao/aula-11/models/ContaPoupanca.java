package models;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Não é possível sacar um valor superior ao saldo");
        }

        setSaldo(this.getSaldo() - valor);
    }

    @Override 
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível depositar um valor menor ou igual a 0");
        }

        this.setSaldo(this.getSaldo() + valor);
    }
}
