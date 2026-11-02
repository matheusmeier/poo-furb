public class Main {
    public static void main(String[] args) {
        //Ex01
        Pessoa pessoa1 = new Pessoa("Matheus", 19);
        Pessoa pessoa2 = new Pessoa("Bruno", 42);

        //Ex02
        Aluno aluno1 = new Aluno("Matheus", 001, "Ciencias de Dados");
        Aluno aluno2 = new Aluno("Jorge", 002, "Direito");
        Aluno aluno3 = new Aluno("Guilherme", 003, "Medicina");

        //Ex03
        Livro livro1 = new Livro("Volta ao mundo", pessoa1, 230);

        //Ex04
        Produto produto1 = new Produto("Arroz", 29.90, 5);

        //Ex05
        Carro carro1 = new Carro("Honda", "Civic", 2022);
        Carro carro2 = new Carro("Byd", "Dolphin", 2025);
        Carro carro3 = new Carro("Chevrolet", "Monatana", 2009);

        //Ex06
        Motor motor1 = new Motor(222, "Gasolina");
        Carro carro4 = new Carro("Honda", "HRV", 2024, motor1);

        //Ex07
        Fabricante fabricante = new Fabricante("Samsung", "Japão");
        Produto celular = new Produto("S23 ultra", 10, 2499.99, fabricante);

        //Ex08
        Funcionario funcionario = new Funcionario("Welligton", "Consultor de vendas", 12499.50);

        //Sobrecarga de Construtores
        Livro livroS1 = new Livro("Hobbit");
        Livro livroS2 = new Livro("Hobbit", pessoa2);
        Livro livroS4 = new Livro("Hobbit", pessoa2, 340);

        Carro carroS1 = new Carro("Honda", "City");
        Carro carroS2 = new Carro("Honda", "City", 2019, motor1);

    }
}