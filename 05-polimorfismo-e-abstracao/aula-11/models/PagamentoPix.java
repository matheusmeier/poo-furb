package models;

public class PagamentoPix extends Pagamento {
    
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override 
    public double calcularValorFinal() {
        return Math.round(this.getValor() * 0.95);
    }

}
