package models;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome.length()<2) {
            throw new IllegalArgumentException("Nome deve ter mais que 2 caracteres");
        }

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    

   
}