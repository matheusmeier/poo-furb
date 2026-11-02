package models;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int cpf;
    private long telefone;
    private ArrayList<ContaBancaria> contasBancarias;

    public Cliente(String nome, int cpf, long telefone, ArrayList<ContaBancaria> contaBancarias) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setContasBancarias(contaBancarias);
    }

    public Cliente(String nome, int cpf, long telefone) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) { 
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public ArrayList<ContaBancaria> getContasBancarias() {
        return this.contasBancarias;
    }

    public void setContasBancarias(ArrayList<ContaBancaria> contasBancarias) {
        this.contasBancarias = contasBancarias;
    }

    

}
