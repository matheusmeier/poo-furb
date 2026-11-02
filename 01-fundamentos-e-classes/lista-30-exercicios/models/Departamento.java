public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        setNome(nome);
        setSigla(sigla);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return this.sigla;
    }
}
