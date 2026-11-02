package models;

public abstract class ItemBiblioteca {
    
    private String titulo;
    private int ano;

    public ItemBiblioteca(String titulo, int ano) {
        setTitulo(titulo);
        setAno(ano);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract int calcularPrazoEmprestimo();
}
