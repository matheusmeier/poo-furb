package models;

public class ProdutoImportadoQ4 extends ProdutoQ4 {
    
    private double taxaImportacao;

    public ProdutoImportadoQ4(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        setTaxaImportacao(taxaImportacao);;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularPrecoFinal() {
        return (getPreco() + getTaxaImportacao());
    }
  
}
