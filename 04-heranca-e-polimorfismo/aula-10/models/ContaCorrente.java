package models;

public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override 
    public void sacar(double valor) {
        
        if (valor + 2 > getSaldo()) {
            throw new IllegalArgumentException("Não é possível sacar um valor superior ao saldo");
        }

        setSaldo(getSaldo() - (valor + 2));
    }
}
