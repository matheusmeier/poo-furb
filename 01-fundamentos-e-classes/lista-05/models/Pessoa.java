

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private boolean maiorDeIdade;
    private static int quantidadePessoas;

    public Pessoa(String nome) {
        setNome(nome);
        setIdade(0);

        quantidadePessoas++;
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);

        quantidadePessoas++;
    }

    public Pessoa(String nome, int idade, double altura, boolean maiorDeIdade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.maiorDeIdade = maiorDeIdade;

        quantidadePessoas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome inválido");
        }

        if (nome.isBlank()) {
            throw new RuntimeException("Nome vazio");
        }

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade<0) {
            throw new RuntimeException("Idade inválida");
        }

        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }

    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }

    public static int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void apresentar() {
        System.out.printf("Nome: %s%nIdade: %d%n", this.nome, this.idade);
    }

    public void apresentar(String mensagem) {
        System.out.println(mensagem);
        apresentar();
    }

}