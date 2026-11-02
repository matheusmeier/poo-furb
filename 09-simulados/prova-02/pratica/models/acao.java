//Matheus Hermann Starke Meier

package models;

public class Acao implements Ativo {

    public int qtdCota;
    public double valorCota;
    public double dividendo;

    public Acao(int qtdCota, double valorCota, double dividendo) {
        setQtdCota(qtdCota);
        setValorCota(valorCota);
        setDividendo(dividendo);
    }

    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        if (qtdCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota está incorreto");
        }

        this.qtdCota = qtdCota;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        if (valorCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo valorCota está incorreto");
        }

        this.valorCota = valorCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        if (dividendo <= 0) {
            throw new IllegalArgumentException("Valor para o campo dividendo está incorreto");
        }

        this.dividendo = dividendo;
    }

    

    @Override
    public double calcularRendimento() {
        return (this.getQtdCota() * this.getDividendo());
    }

    @Override
    public double calcularValorInvestido() {
        return (this.getQtdCota() * this.getValorCota());
    }

}
