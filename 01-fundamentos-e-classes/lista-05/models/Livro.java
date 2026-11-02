public class Livro {

    String titulo;
    Pessoa autor;
    int numeroPaginas;
    int anoPublicacao;
    boolean emprestado;
    String pessoaEmprestimo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, Pessoa autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

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

    public void emprestar() {
        this.emprestado = true;
        Biblioteca.totalLivrosEmprestados++;
    }

    public void emprestar(String pessoaEmprestimo) {
        emprestar();
        this.pessoaEmprestimo = pessoaEmprestimo;
    }
    
}
