public class Aluno {

    String nome;
    int matricula;
    double nota;
    boolean aprovado;
    Pessoa pessoa;
    String curso;

    public Aluno(int matricula, double nota, boolean aprovado, Pessoa pessoa) {
        this.matricula = matricula;
        this.nota = nota;
        this.aprovado = aprovado;
        this.pessoa = pessoa;
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

}
