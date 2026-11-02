package models;

public class PagamentoBoleto extends Pagamento {
    
    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override 
    public double calcularValorFinal() {
        return Math.round(this.getValor() * 1.1);
    }
}
