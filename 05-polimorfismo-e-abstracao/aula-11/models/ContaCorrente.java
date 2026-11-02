package models;

public class ContaCorrente extends ContaBancaria {

    private double taxa;

    public ContaCorrente(double saldo, double taxa) {
        super(saldo);

        setTaxa(taxa);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        if (valor + this.getTaxa() > this.getSaldo()) {
            throw new IllegalArgumentException("Não é possível sacar um valor superior ao saldo");
        }

        this.setSaldo(this.getSaldo() - (valor + this.getTaxa()));
    }

    @Override 
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível depositar um valor menor ou igual a 0");
        }

        this.setSaldo(this.getSaldo() + valor);
    }

}
