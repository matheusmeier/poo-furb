public class Produto {
    private String nome;
    private int quantidade;
    private Double preco;
    private Pessoa comprador;
    private boolean disponivel;
    private Fabricante fabricante;

    public Produto(String nome, int quantidade, Double preco) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public Produto(String nome, int quantidade, Double preco, Fabricante fabricante) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
        setFabricante(fabricante);
    }

    public Produto(String nome, int quantidade, Double preco, Pessoa comprador, boolean disponivel) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
        setComprador(comprador);
        setDisponivel(disponivel);
    }

    public Produto(String nome, int quantidade, Double preco, Pessoa comprador, boolean disponivel, Fabricante fabricante) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
        setComprador(comprador);
        setDisponivel(disponivel);
        setFabricante(fabricante);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public Pessoa getComprador() {
        return this.comprador;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

}
