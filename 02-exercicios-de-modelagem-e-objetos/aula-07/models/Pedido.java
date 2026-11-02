package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private int numero;
    private LocalDate data;
    private double valorTotal;
    private ArrayList<Produto> produtos;

    public Pedido(int numero, LocalDate data, double valorTotal, ArrayList<Produto> produtos) {
        setNumero(numero);
        setData(data);
        setValorTotal(valorTotal);
        setProdutos(produtos);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}
