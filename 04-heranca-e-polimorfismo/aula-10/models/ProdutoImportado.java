package models;

public class ProdutoImportado extends Produto {
    
    public ProdutoImportado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return (Math.round(getPreco() * 1.2f));
    }

}
