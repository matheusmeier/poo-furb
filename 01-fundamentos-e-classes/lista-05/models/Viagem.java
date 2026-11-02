public class Viagem {

    private String origem;
    private String destino;
    private double distancia;
    private double preco;

    public Viagem(String destino) {
        setDestino(destino);
    }

    public Viagem(String destino, String origem) {
        setDestino(destino);
        setOrigem(origem);
    }

    public Viagem(String destino, String origem, double distancia) {
        setDestino(destino);
        setOrigem(origem);
        setDistancia(distancia);
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void calcularCusto(double precoCombustivel) {
        this.preco = precoCombustivel;
    }

    public void calcularCusto(double precoCombustivel, double precoPedagio) {
        this.preco = precoCombustivel + precoPedagio;
    }
}
