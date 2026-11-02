//Matheus Hermann Starke Meier

package models;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Ativo> carteira;
    private double rendimentoCarteira;

    private double valorInvestido;
    private String nome;

    public Cliente(String nome) {
        setNome(nome);

        carteira = new ArrayList<Ativo>();
    }

    public void setCarteira(ArrayList<Ativo> carteira) {
        this.carteira = carteira;
    }

    public double getRendimentoCarteira() {
        return rendimentoCarteira;
    }

    public void setRendimentoCarteira(double rendimentoCarteira) {
        this.rendimentoCarteira = rendimentoCarteira;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAtivo(Ativo ativo) {
        if (ativo == null) {
            throw new IllegalArgumentException("Valor para o campo ativo está incorreto");
        }

        carteira.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        if ((ativo == null) || (this.getCarteira().isEmpty())) {
            throw new IllegalArgumentException("Valor para o campo ativo está incorreto");
        }

        carteira.remove(ativo);
    }

    public double calcularRendimentoCarteira() {
        this.rendimentoCarteira = 0;

        for (Ativo ativo : carteira) {
            rendimentoCarteira += ativo.calcularRendimento();
        }

        return this.rendimentoCarteira;
    }

    public double calcularValorInvestido() {
        this.valorInvestido = 0;

        for (Ativo ativo : carteira) {
            this.valorInvestido += ativo.calcularValorInvestido();
        }

        return this.valorInvestido;

    }

    public ArrayList<Ativo> getCarteira() {
        return this.carteira;
    }

}
