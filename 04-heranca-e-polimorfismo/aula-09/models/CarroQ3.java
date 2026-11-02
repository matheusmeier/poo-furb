package models;

public class CarroQ3 extends VeiculoQ3{
    
    private int quantidadePortas;

    public CarroQ3(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        setQuantidadePortas(quantidadePortas);

        exibirDados();
    }

    @Override 
    public void exibirDados() {
        System.out.printf(
            "DADOS DO CARRO%n---------------------------------%nMarca: %s%nModelo: %s%nAno: %d%nQuantidade de Portas: %d%n",
                                                                                                getMarca(),
                                                                                                getModelo(),
                                                                                                getAno(),
                                                                                                getQuantidadePortas()
        );
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    
}
