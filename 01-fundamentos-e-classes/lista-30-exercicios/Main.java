

public class Main {
    public static void main(String[] args) {

        /* -------------------------------------
        Parte 1 – Instanciação simples
        -------------------------------------
         */ 

        Pessoa q1 = new Pessoa("Ana", 21, 1.68, true);
        Pessoa q2 = new Pessoa("Miguel", 77, 1.91, true);
        Pessoa q3 = new Pessoa("Matheus", 19, 1.81, true);

        Livro q4 = new Livro("Clean Code", 464, 2008);

        Produto q5 = new Produto("Mouse gamer", 120, 150.00);
        Produto q5b = new Produto("Monitor 60hz", 20, 399.00);

        Carro q6 = new Carro("Volvo", 15000, 2024, false);
        Carro q6b = new Carro("Honda", 90000, 2023, true);

        /* -------------------------------------
        Parte 2 – Objetos relacionados
        -------------------------------------
         */ 

        Pessoa q7 = new Pessoa("Carlos", 25, 1.90, true);
        Aluno q7b = new Aluno(707, 8.5, true, q7);

        Pessoa q8 = new Pessoa("Maria", 17, 1.68, false);
        Livro q8b = new Livro("Memórias de natal", q8, 890, 2025);

        Pessoa q9 = new Pessoa("Lucas", 43, 1.75, true);
        Livro q9b = new Livro("Rápido e devagar", q9, 230, 2017);

        Pessoa q9c = new Pessoa("Paulo", 59, 1.64, true);
        Livro q9d = new Livro("Relatos de um caçador", q9c, 120, 2015);

        Pessoa q10 = new Pessoa("João", 32, 1.75, true);
        Produto q10b = new Produto("Notebook", 8, 4500.00, q10, true);

        Pessoa q11 = new Pessoa("Gabriel", 77, 1.77, true);
        Pessoa q11b = new Pessoa("Rafael", 77, 1.77, true);
        Produto q11c = new Produto("Tenis", 50, 299.99, q11, true);
        Produto q11d = new Produto("Camisa", 300, 59.90, q11, true);
        Produto q11e = new Produto("Moletom", 150, 199.99, q11b, true);

        Pessoa q12 = new Pessoa("Roberto", 20, 1.80, true);
        Carro q12b = new Carro("HRV", 200000, 2017, true, "Cinza", q12);

        /* -------------------------------------
        Parte 3 – Trabalhando com subobjetos 
        -------------------------------------
         */ 

        Fabricante q13 = new Fabricante("Dell", "Estados Unidos");
        Produto q13b = new Produto("Notebook", 300, 10000.00, q13);

        Fabricante q14 = new Fabricante("Asics", "Estados Unidos");
        Fabricante q14b = new Fabricante("Mizuno", "japão");
        Produto q14c = new Produto("Nova Blast", 200, 800.00, q14);
        Produto q14d = new Produto("Nimbus", 150, 1200.99, q14);
        Produto q14e = new Produto("Neo Vortex", 50, 350.00, q14b);

        Pessoa q15 = new Pessoa("Ditmar", 59, 1.75, true);
        Fabricante q15b = new Fabricante("Tissot", "Suiça");
        Produto q15c = new Produto("PRX Powermatic 80", 10, 7500.00, q15, true, q15b);

        Motor q16 = new Motor(150, 1.3, "Gasolina");
        Carro q16b = new Carro("Montana", 300000, 2010, true, q16);

        Motor q17 = new Motor(220, 2, "Gasolina");
        Motor q17b = new Motor(4000, 3, "Diesel");
        Carro q17c = new Carro("Amaroc", 150000, 2018, true, q17);
        Carro q17d = new Carro("Hilux", 50000, 2024, false, q17b);

        Pessoa q18 = new Pessoa("Pedro", 54, 1.70, true);
        Motor q18b = new Motor(220, 2, "Gasolina");
        Carro q18c = new Carro("Civic", 0, 2026, false, "Preto", q18, q18b);

        Departamento q19 = new Departamento("Tecnologia", "TI");
        Funcionario q19b = new Funcionario("João", "Desenvolvedor", 5000, q19);

        Departamento q20 = new Departamento("Financeiro", "Fin");
        Funcionario q20b = new Funcionario("Jonas", "Analista", 4000, q20);
        Funcionario q20c = new Funcionario("Tadeu", "Consultor", 9000, q20);
        Funcionario q20d = new Funcionario("Joel", "Gerente", 17500, q20);

        /* -------------------------------------
        Parte 4 – Mais de um nível de objetos 
        -------------------------------------
         */ 

        Pessoa q21 = new Pessoa("Matheus", 19, 1.81, true);
        Fabricante q21b = new Fabricante("BioGas", "Brasil");
        Produto q21c = new Produto("Camisa básica", 2000, 49.90, q21, true, q21b);

        Pessoa q22 = new Pessoa("Pedro", 50, 1.90, true);
        Fabricante q22b = new Fabricante("Toyota", "Estados Unidos");
        Motor q22c = new Motor(220, 2, "Diesel");
        Carro q22d = new Carro("Corolla", 0, 2026, false, "Branco", q22, q22c);

        Pessoa q23 = new Pessoa("Matheus", 19, 1.81, true);
        Motor q23b = new Motor(110, 1.5, "Gasolina");
        Motor q23c = new Motor(110, 2, "Diesel");
        Carro q23d = new Carro("HRV", 50000, 2021, true, "Cinza", q23, q23b);
        Carro q23e = new Carro("Montana", 300000, 2008, true, "Branco", q23, q23c);

        Pessoa q24 = new Pessoa("Matheus", 19, 1.81, true);
        Fabricante q24b = new Fabricante("Nike", "Estados Unidos");
        Fabricante q24c = new Fabricante("Adidas", "Alemanha");
        Produto q24d = new Produto("Vomero", 500, 700.00, q24, true, q24b);
        Produto q24e = new Produto("Adizero drive", 300, 850.00, q24, true, q24c);
    }
}