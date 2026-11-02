package models;

public class ContaCorrenteEspecial extends ContaBancaria {

    private double taxa;

    public ContaCorrenteEspecial(double saldo, double taxa) {
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
        if (valor + (taxa - 10) > this.getSaldo()) {
            throw new IllegalArgumentException("Não é possível sacar um valor superior ao saldo");
        }

        this.setSaldo(this.getSaldo() - (valor + (taxa - 10)));
    }

    @Override 
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível depositar um valor menor ou igual a 0");
        }

        this.setSaldo(this.getSaldo() + valor);
    }

}
