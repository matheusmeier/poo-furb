package models;

import java.util.ArrayList;

public class Professor {
    private String nome ;
    private int matricula;
    private String titulacao;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, int matricula, String titulacao, ArrayList<Disciplina> disciplinas) {
        setNome(nome);
        setMatricula(matricula);
        setTitulacao(titulacao);
        setDisciplinas(disciplinas);
    }

    public Professor(String nome, int matricula, String titulacao) {
        setNome(nome);
        setMatricula(matricula);
        setTitulacao(titulacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    

    
}
