// Matheus Hermann Starke Meier

import models.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jorge");

        Ativo ativo1 = new Acao(10, 50, 2);
        Ativo ativo2 = new Acao(10, 70, 5);
        Ativo ativo3 = new Acao(10, 150, 10);

        TesouroDireto ativo4 = new TesouroDireto(1000, 5);

        cliente.adicionarAtivo(ativo1);
        cliente.adicionarAtivo(ativo2);
        cliente.adicionarAtivo(ativo3);
        cliente.adicionarAtivo(ativo4);

        System.out.printf("Valor total investido Carteira de %s: R$%.2f%n", cliente.getNome(), cliente.calcularValorInvestido());
        System.out.printf("Rendimento total Carteira de %s: R$%.2f", cliente.getNome(), cliente.calcularRendimentoCarteira());
        
    }
}