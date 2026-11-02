package models;

public class ProdutoPromocional extends Produto {
    
    public ProdutoPromocional(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return (this.getPreco() * 0.8);
    }
}
