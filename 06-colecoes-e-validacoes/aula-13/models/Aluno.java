package models;

public class Aluno {
    
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.printf("Nome do aluno: %s%n", getNome());
        System.out.printf("Idade do aluno: %d%n", getIdade());
    }
}
