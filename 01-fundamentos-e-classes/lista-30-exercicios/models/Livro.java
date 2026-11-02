public class Livro {
    String titulo;
    Pessoa autor;
    int numeroPaginas;
    int anoPublicacao;

    public Livro(String titulo, int numeroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, Pessoa autor, int numeroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    
}
