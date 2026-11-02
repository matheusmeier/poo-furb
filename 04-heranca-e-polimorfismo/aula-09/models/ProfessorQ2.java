package models;

public class ProfessorQ2 extends PessoaQ2 {

    private double salario;
    private String disciplina;

    public ProfessorQ2(String nome, int cpf, double salario, String disciplina) {
        super(nome, cpf);
        setSalario(salario);
        setDisciplina(disciplina);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
