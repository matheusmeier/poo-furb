package models;

public class VeiculoQ3 {

    private String marca;
    private String modelo;
    private int ano;

    public VeiculoQ3(String marca, String modelo, int ano) {

        setMarca(marca);
        setModelo(modelo);   
        setAno(ano);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.printf(
            "DADOS DO VEÍCULO%n---------------------------------%nMarca: %s%nModelo: %s%nAno: %d%n",
                                                                                                getMarca(),
                                                                                                getModelo(),
                                                                                                getAno()
        );
    }

}
