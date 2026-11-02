package models;

public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override 
    public void sacar(double valor) {

        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Não é possível sacar um valor maior que o saldo");
        }

        setSaldo(getSaldo() - valor);
    }
}
