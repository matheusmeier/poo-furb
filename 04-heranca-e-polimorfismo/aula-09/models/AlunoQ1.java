package models;

public class AlunoQ1 extends PessoaQ1 {
    
    private int matricula;

    public AlunoQ1(String nome, int idade, int matricula) {
        super(nome, idade);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
