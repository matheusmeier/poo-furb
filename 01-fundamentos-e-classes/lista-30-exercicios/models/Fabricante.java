public class Fabricante {
    private String nome;
    private String pais;

    public Fabricante(String nome, String pais) {
        setNome(nome);
        setPais(pais);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return this.pais;
    }
}
