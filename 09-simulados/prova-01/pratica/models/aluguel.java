package models;

public class Aluguel {
    
    private int qtdDias;
    private int qtdPassageiros;
    private double diaria = 150;

    public Aluguel(int qtdDias, int qtdPassageiros) {
        setQtdDias(qtdDias);
        setQtdPassageiros(qtdPassageiros);
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        if (qtdDias <= 0) {
            throw new IllegalArgumentException("Valor da quantidade de dias inválido");
        }

        this.qtdDias = qtdDias;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        if (qtdPassageiros <= 0) {
            throw new IllegalArgumentException("Valor da quantidade de passageiros inválido");
        }

        this.qtdPassageiros = qtdPassageiros;
    }

    public double calcularValorAluguel() {
        if (getQtdPassageiros() > 4) {
            this.diaria += (20 * (getQtdPassageiros() - 4));
        }

        return this.diaria * getQtdDias();
    }

}
