import models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Questão 1)
         * 
         * String nome;
         * int idade = 0;
         * 
         * System.out.print("Informe o nome do aluno: ");
         * nome = scanner.nextLine();
         * 
         * while (true) {
         * try {
         * System.out.print("Informe a idade do aluno: ");
         * idade = Integer.parseInt(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("Por favor, digite um número inteiro");
         * }
         * }
         * 
         * Aluno aluno = new Aluno(nome, idade);
         * 
         * System.out.println("------------------------------------");
         * System.out.println("Aluno criado com sucesso!");
         * System.out.println("------------------------------------");
         * aluno.exibirDados();
         * 
         * 
         * Questão 2)
         * 
         * Calculadora calculadora = new Calculadora();
         * 
         * System.out.println("----------------------------");
         * System.out.println("SOMA DE DOIS NÚMEROS INTEIROS");
         * System.out.println("----------------------------");
         * int soma1 = 0, soma2 = 0;
         * 
         * while (true) {
         * try {
         * System.out.print("Número 1: ");
         * soma1 = Integer.parseInt(scanner.next());
         * System.out.print("Número 2: ");
         * soma2 = Integer.parseInt(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("O número informado deve ser do tipo inteiro\n");
         * }
         * }
         * 
         * System.out.printf("%nSoma: %d%n", calculadora.somar(soma1, soma2));
         * System.out.println("----------------------------");
         * 
         * System.out.println("SUBTRAÇÃO DE DOIS NÚMEROS INTEIROS");
         * System.out.println("----------------------------");
         * int subtracao1 = 0, subtracao2 = 0;
         * 
         * while (true) {
         * try {
         * System.out.print("Número 1: ");
         * subtracao1 = Integer.parseInt(scanner.next());
         * System.out.print("Número 2: ");
         * subtracao2 = Integer.parseInt(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("O número informado deve ser do tipo inteiro\n");
         * }
         * }
         * 
         * System.out.printf("%nSubtração: %d%n", calculadora.subtrair(soma1, soma2));
         * System.out.println("----------------------------");
         * 
         * System.out.println("MULTIPLICAÇÃO DE DOIS NÚMEROS");
         * System.out.println("----------------------------");
         * double multiplicacao1 = 0, multiplicacao2 = 0;
         * 
         * while (true) {
         * try {
         * System.out.print("Número 1: ");
         * multiplicacao1 = Double.parseDouble(scanner.next());
         * System.out.print("Número 2: ");
         * multiplicacao2 = Double.parseDouble(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("O valor de entrada deve ser um número.\n");
         * }
         * }
         * 
         * System.out.printf("%nMultiplicação: %.2f%n",
         * calculadora.multiplicar(multiplicacao1, multiplicacao2));
         * System.out.println("----------------------------");
         * 
         * System.out.println("DIVISÃO DE DOIS NÚMEROS");
         * System.out.println("----------------------------");
         * double divisao1 = 0, divisao2 = 0, resultado = 0;
         * 
         * while (true) {
         * try {
         * 
         * while (true) {
         * try {
         * System.out.print("Número 1: ");
         * divisao1 = Double.parseDouble(scanner.next());
         * System.out.print("Número 2: ");
         * divisao2 = Double.parseDouble(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("O valor de entrada deve ser um número.\n");
         * }
         * 
         * }
         * 
         * resultado = calculadora.dividir(divisao1, divisao2);
         * System.out.printf("%nDivisão: %.2f%n", resultado);
         * break;
         * }
         * 
         * catch (ArithmeticException erro) {
         * System.out.println("O valor do segundo número deve ser diferente de 0.\n");
         * }
         * 
         * }
         * 
         * System.out.println("----------------------------");
         * 
         * 
         * Questão 3)
         * 
         * System.out.println("------------------------");
         * System.out.println("CALCULADORA DE MÉDIA");
         * System.out.println("------------------------");
         * 
         * Turma turma = new Turma();
         * ArrayList<Double> notas = new ArrayList<>();
         * double nota1 = 0, nota2 = 0, nota3 = 0;
         * int indice = 0;
         * 
         * while (true) {
         * try {
         * System.out.print("Nota 1: ");
         * nota1 = Double.parseDouble(scanner.next());
         * notas.add(nota1);
         * 
         * System.out.print("Nota 2: ");
         * nota2 = Double.parseDouble(scanner.next());
         * notas.add(nota2);
         * 
         * System.out.print("Nota 3: ");
         * nota3 = Double.parseDouble(scanner.next());
         * notas.add(nota3);
         * 
         * break;
         * 
         * } catch (NumberFormatException erro) {
         * System.out.println("A entrada deve ser um número. \n");
         * notas.clear();
         * }
         * }
         * 
         * System.out.println("------------------------");
         * turma.setNotas(notas);
         * System.out.printf("Média: %.2f%n", turma.calcularMedia());
         * System.out.println("------------------------");
         * 
         * while (true) {
         * 
         * try {
         * while (true) {
         * try {
         * System.out.println(" -- Procurar valor -- ");
         * System.out.print("Indíce: ");
         * indice = Integer.parseInt(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("A entrada deve ser um número inteiro.\n");
         * }
         * }
         * 
         * System.out.printf("Nota %d: %.2f%n", indice+1, turma.consultarNota(indice));
         * break;
         * 
         * } catch (IndexOutOfBoundsException erro) {
         * System.out.println("Por favor, informe uma posição válida.\n");
         * }
         * }
         * 
         * Questão 4)
         * 
         * ContaBancaria contaBancaria = new ContaBancaria(1, "Lucas", 2000);
         * double valor = 0;
         * 
         * while (true) {
         * 
         * try {
         * while (true) {
         * try {
         * try {
         * System.out.print("Informe o valor que você deseja depositar/sacar: R$");
         * valor = Double.parseDouble(scanner.next());
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("A entrada deve ser numérica\n");
         * }
         * 
         * contaBancaria.depositar(valor);
         * break;
         * } catch (IllegalArgumentException erro) {
         * System.out.println("Não é permitido valores menores que 0.\n");
         * }
         * }
         * 
         * contaBancaria.sacar(valor);
         * break;
         * } catch (NumberFormatException erro) {
         * System.out.println("Não é possível sacar um valor maior que o saldo.\n");
         * } catch (IllegalArgumentException erro) {
         * System.out.println("Não é permitido valores menores que 0.\n");
         * }
         * }
         * 
         */

    }

}
