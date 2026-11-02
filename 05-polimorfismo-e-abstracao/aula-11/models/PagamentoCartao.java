package models;

public class PagamentoCartao extends Pagamento {
    
    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override 
    public double calcularValorFinal() {
        return Math.round(this.getValor() * 1.05);
    }
}
