public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private Double preco;
    private Pessoa comprador;
    private boolean disponivel;
    private Fabricante fabricante;
    private Pessoa vendedor;
    
    static int totalProdutosCriados;

    String qntde;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);

        totalProdutosCriados++;
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);

        totalProdutosCriados++;
    }

    public Produto(String nome, String qntde, Double preco) {
        setNome(nome);
        setPreco(preco);

        if (qntde == null) {
            setQuantidadeEstoque(0);
        } else {
            setQuantidadeEstoque(Integer.parseInt(qntde));

        }

        System.out.printf("Quantidade setada para: %d", this.quantidadeEstoque);
        totalProdutosCriados++;
    }

    public Produto(String nome, int quantidade, Double preco, Fabricante fabricante) {
        setNome(nome);
        setQuantidadeEstoque(quantidade);
        setPreco(preco);
        setFabricante(fabricante);

        totalProdutosCriados++;
    }

    public Produto(String nome, int quantidade, Double preco, Pessoa comprador, boolean disponivel) {
        setNome(nome);
        setQuantidadeEstoque(quantidade);
        setPreco(preco);
        setComprador(comprador);
        setDisponivel(disponivel);

        totalProdutosCriados++;
    }

    public Produto(String nome, int quantidade, Double preco, Pessoa comprador, boolean disponivel,
        Fabricante fabricante) {
        setNome(nome);
        setQuantidadeEstoque(quantidade);
        setPreco(preco);
        setComprador(comprador);
        setDisponivel(disponivel);
        setFabricante(fabricante);

        totalProdutosCriados++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQuantidadeEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new RuntimeException("Quantidade inválida");
        }

        this.quantidadeEstoque = quantidade;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco<0) {
            throw new RuntimeException("Preço inválido");
        }

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

    public void aplicarDesconto(double percentual) {
        this.preco = preco * ((100-percentual)/100);
    }

    public void aplicarDesconto(double percentual, double descontoAdicional) {
        aplicarDesconto(percentual);
        aplicarDesconto(descontoAdicional);
    }

    public static double calcularPrecoComDesconto(double preco, double percentual) {
        return (preco * ((100-percentual)/100));
    }

}
