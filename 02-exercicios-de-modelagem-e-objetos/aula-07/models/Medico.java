package models;
import java.util.ArrayList;

public class Medico {
    private int crm;
    private String nome;
    private String especialidade;
    private ArrayList<Paciente> clientes;

    

    public Medico(int crm, String nome, String especialidade, ArrayList<Paciente> clientes) {
        setCrm(crm);
        setNome(nome);
        setEspecialidade(especialidade);
        setClientes(clientes);
    }

    public Medico(int crm, String nome, String especialidade) {
        setCrm(crm);
        setNome(nome);
        setEspecialidade(especialidade);
    }


    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public ArrayList<Paciente> getClientes() {
        return this.clientes;
    }
    public void setClientes(ArrayList<Paciente> clientes) {
        this.clientes = clientes;
    }

    
}
