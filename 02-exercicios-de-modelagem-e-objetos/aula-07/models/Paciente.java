package models;
import java.util.ArrayList;

public class Paciente {
    private int cpf;
    private String nome;
    private long telefone;
    private ArrayList<Medico> medicos;

    public Paciente(int cpf, String nome, long telefone, ArrayList<Medico> medicos) {
        setCpf(cpf);
        setNome(nome);
        setTelefone(telefone);
        setMedicos(medicos);
    }

    public Paciente(int cpf, String nome, long telefone) {
        setCpf(cpf);
        setNome(nome);
        setTelefone(telefone);
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    

}
