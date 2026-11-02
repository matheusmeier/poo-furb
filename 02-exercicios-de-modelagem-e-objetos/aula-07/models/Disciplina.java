package models;
import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private Professor docente;
    private ArrayList<Aluno> alunos;


    

    public Disciplina(int codigo, String nome, int cargaHoraria, Professor docente, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.docente = docente;
        this.alunos = alunos;
    }

    public Disciplina(int codigo, String nome, int cargaHoraria, Professor docente) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.docente = docente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getDocente() {
        return docente;
    }

    public void setDocente(Professor docente) {
        this.docente = docente;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    
}
