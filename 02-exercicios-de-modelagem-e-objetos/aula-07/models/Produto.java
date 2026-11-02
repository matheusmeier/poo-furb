package models;

import java.util.ArrayList;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private ArrayList<Pedido> pedidos;

    public Produto(int codigo, String descricao, double preco, ArrayList<Pedido> pedidos) {
        setCodigo(codigo);;
        setDescricao(descricao);
        setPreco(preco);
        setPedidos(pedidos);
    }

    public Produto(int codigo, String descricao, double preco) {
        setCodigo(codigo);;
        setDescricao(descricao);
        setPreco(preco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
