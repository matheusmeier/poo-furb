import models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
         * 
         * Questão 1:
         * Funcionario q1a = new Vendedor("Natan", 10000);
         * Funcionario q1b = new Gerente("Lucas", 10000, 20, 100);
         * Funcionario q1c = new Consultor("Jonas", 10000, 5000);
         * 
         * System.out.println(q1a.calcularSalario());
         * System.out.println(q1b.calcularSalario());
         * System.out.println(q1c.calcularSalario());
         * 
         * Questão 2:
         * Animal[] q2 = new Animal[3];
         * 
         * q2[0] = new Cachorro();
         * q2[1] = new Gato();
         * q2[2] = new Vaca();
         * 
         * for (Animal animal: q2) {
         * System.out.println(animal.emitirSom());
         * }
         * 
         * Questão 3:
         * Veiculo[] q3 = new Veiculo[3];
         * 
         * q3[0] = new Carro();
         * q3[1] = new Moto();
         * q3[2] = new Caminhao();
         * 
         * for (Veiculo veiculo: q3) {
         * veiculo.acelerar();
         * }
         * 
         * Questão 4:
         * Figura[] q4 = new Figura[3];
         * 
         * q4[0] = new Circulo(2);
         * q4[1] = new Retangulo(10, 20);
         * q4[2] = new Triangulo(10, 20);
         * 
         * for (Figura figura: q4) {
         * System.out.println(figura.calcularArea());
         * }
         * 
         * Questão 5:
         * ContaBancaria[] q5 = new ContaBancaria[2];
         * 
         * q5[0] = new ContaCorrente(1000, 50);
         * q5[1] = new ContaPoupanca(1000);
         * 
         * for (ContaBancaria contaBancaria: q5) {
         * contaBancaria.sacar(100);
         * System.out.println(contaBancaria.getSaldo());
         * }
         * 
         * Questão 6:
         * ArrayList<Funcionario> funcionarios = new ArrayList<>();
         * 
         * funcionarios.add(new Vendedor("Matias", 10000));
         * funcionarios.add(new Gerente("Jonas", 10000, 20, 10000));
         * funcionarios.add(new Consultor("Saulo", 10000, 10000));
         * 
         * Empresa q6 = new Empresa(funcionarios);
         * 
         * q6.calcularCustoSalarios();
         * 
         * Questão 7:
         * Pagamento[] q7 = new Pagamento[3];
         * 
         * q7[0] = new PagamentoPix(1000);
         * q7[1] = new PagamentoCartao(1000);
         * q7[2] = new PagamentoBoleto(1000);
         * 
         * for (Pagamento pagamento : q7) {
         * System.out.printf("O valor a ser pago é de: R$%.2f%n",
         * pagamento.calcularValorFinal());
         * }
         * 
         * Questão 8:
         * ArrayList<Produto> q8 = new ArrayList<>();
         * 
         * q8.add(new ProdutoNacional("Crime e Castigo", 100));
         * q8.add(new ProdutoImportado("Crime and Punishment", 100));
         * q8.add(new ProdutoPromocional("Crime e Castigo", 100));
         * 
         * for (Produto produto: q8) {
         * System.out.println(produto.calcularPrecoFinal());
         * }
         * 
         * Questão 9:
         * ArrayList<Instrumento> q9 = new ArrayList<>();
         * 
         * q9.add(new Violao());
         * q9.add(new Piano());
         * q9.add(new Bateria());
         * 
         * for (Instrumento instrumento: q9) {
         * instrumento.tocar();
         * }
         * 
         * Questão 10:
         * ArrayList<Funcionario> q10 = new ArrayList<>();
         * 
         * q10.add(new Gerente("Lucas", 1000, 20, 0));
         * q10.add(new Desenvolvedor("Lucas", 1000));
         * q10.add(new Estagiario("Lucas", 1000));
         * 
         * for (Funcionario funcionario: q10) {
         * System.out.println(funcionario.calcularBonus());
         * }
         * 
         * Questão 11:
         * ArrayList<Transporte> q11 = new ArrayList<>();
         * 
         * q11.add(new Taxi(10));
         * q11.add(new Onibus(10));
         * q11.add(new Uber(10));
         * 
         * for (Transporte transporte: q11) {
         * System.out.println(transporte.calcularCusto());
         * }
         * 
         * Questão 12:
         * ArrayList<Entrega> q12 = new ArrayList<>();
         * 
         * q12.add(new EntregaNormal(0, 5));
         * q12.add(new EntregaExpressa(0, 5));
         * q12.add(new EntregaAgendada(0, 5));
         * 
         * for (Entrega entrega: q12) {
         * System.out.println(entrega.calcularFrete());
         * }
         * 
         * Questão 13:
         * ArrayList<Animal> q13 = new ArrayList<>();
         * 
         * q13.add(new Cachorro("Cachorro", 0));
         * q13.add(new Gato("Gato", 0));
         * q13.add(new Cavalo("Cavalo", 0));
         * q13.add(new Galinha("Galinha", 0));
         * 
         * Fazenda fazenda = new Fazenda(q13);
         * 
         * fazenda.mostrarFazenda();
         * 
         * Questão 14:
         * ArrayList<Funcionario> q14 = new ArrayList<>();
         * 
         * q14.add(new Vendedor("Lucas", 1000));
         * q14.add(new Gerente("Lucas", 1000, 20, 1000));
         * q14.add(new Consultor("Lucas", 1000, 500));
         * 
         * for (Funcionario funcionario: q14) {
         * System.out.println(funcionario.calcularSalario());
         * }
         * 
         * Questão 15:
         * ArrayList<Veiculo> q15 = new ArrayList<>();
         * 
         * q15.add(new Carro("HRV", 100000));
         * q15.add(new Moto("Bis", 10000));
         * q15.add(new Caminhao("Caminhão", 200000));
         * 
         * for (Veiculo veiculo: q15) {
         * System.out.println(veiculo.calcularImposto());
         * }
         * 
         * Questão 16:
         * ArrayList<ItemBiblioteca> q16 = new ArrayList<>();
         * 
         * q16.add(new Livro("Livro", 0));
         * q16.add(new Revista("Revista", 0));
         * q16.add(new DVD("DVD", 0));
         * 
         * for (ItemBiblioteca itemBiblioteca: q16) {
         * System.out.printf("%s tem prazo para devolução de %s dias.%n",
         * itemBiblioteca.getTitulo(),
         * itemBiblioteca.calcularPrazoEmprestimo()
         * 
         * );
         * }
         * 
         * Questão 17:
         * Funcionario q17 = new Vendedor("Lucas", 1000);
         * 
         * ((Vendedor) q17).registrarVenda(200);
         * 
         * Questão 18:
         * ArrayList<Funcionario> q18 = new ArrayList<>();
         * 
         * q18.add(new Funcionario("Lucas", 1000));
         * q18.add(new Vendedor("João", 1000));
         * q18.add(new Gerente("Marcos", 1000, 50, 1000));
         * 
         * for (Funcionario funcionario : q18) {
         * 
         * if (funcionario instanceof Vendedor) {
         * ((Vendedor) funcionario).registrarVenda(200);
         * }
         * 
         * if (funcionario instanceof Gerente) {
         * ((Gerente) funcionario).definirMeta(500);
         * }
         * 
         * System.out.printf("%s tem um salário de R$%.2f.%n%n",
         * funcionario.getNome(),
         * funcionario.calcularSalario());
         * }
         * 
         * Questão 19:
         * ArrayList<Veiculo> q19 = new ArrayList<>();
         * 
         * q19.add(new Carro("HRV", 100000));
         * q19.add(new Moto("Bis", 10000));
         * q19.add(new Caminhao("Caminhao", 200000));
         * 
         * for (Veiculo veiculo : q19) {
         * if (veiculo instanceof Carro) {
         * System.out.printf("%s possui quatro rodas.%n",
         * veiculo.getModelo());
         * }
         * 
         * if (veiculo instanceof Moto) {
         * System.out.printf("%s possui duas rodas.%n",
         * veiculo.getModelo());
         * }
         * }
         * 
         * Questão 20:
         * ArrayList<ContaBancaria> q20 = new ArrayList<>();
         * 
         * q20.add(new ContaCorrente(1000, 60));
         * q20.add(new ContaCorrenteEspecial(1000, 60));
         * q20.add(new ContaPoupanca(1000));
         * 
         * for (ContaBancaria contaBancaria : q20) {
         * contaBancaria.sacar(900);
         * 
         * System.out.printf("A conta n.%d está com o saldo de R$%.2f.%n",
         * contaBancaria.getNumero(),
         * contaBancaria.getSaldo());
         * }
         * 
         * Questão 21
         * ArrayList<ContaBancaria> q21 = new ArrayList<>();
         * 
         * ContaBancaria q21a = new ContaPoupanca(1000);
         * ContaBancaria q21b = new ContaCorrente(1000, 10);
         * 
         * q21.add(q21a);
         * q21.add(q21b);
         * 
         * q21a.transferir(q21b, 500);
         * 
         * for (ContaBancaria contaBancaria : q21) {
         * System.out.printf("A conta n.%d está com o saldo de R$%.2f.%n",
         * contaBancaria.getNumero(),
         * contaBancaria.getSaldo());
         * }
         */

    }
}
