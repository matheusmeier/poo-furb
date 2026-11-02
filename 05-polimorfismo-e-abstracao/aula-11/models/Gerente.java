package models;

public class Gerente extends Funcionario {

    private double comissao;
    private double valorVendas;

    public Gerente(String nome, double salarioBase, double comissao, double valorVendas) {
        super(nome, salarioBase);

        setComissao(comissao);
        setValorVendas(valorVendas);
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void definirMeta(double valor) {
        System.out.printf("%s registrou uma meta no valor de R$%.2f.%n",
                this.getNome(),
                valor);
    }

    @Override
    public double calcularSalario() {
        return Math.round(getSalarioBase() + ((getComissao() / 100) * getValorVendas()));
    }

    @Override
    public double calcularBonus() {
        return Math.round(this.calcularSalario() * 1.3);
    }
}
