import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArquivoRepositorio teste = new ArquivoRepositorio();

        // teste.criarDiretorio("Dog");
        // teste.listarDiretorio("C:\\Users\\mhsmeier\\Documents\\orientado-a-objeto\\unidade4\\aula10");
        // teste.criarEstrutura();

        /*
         * teste.mudarNome("Lucas.txt", jonas);
         * teste.excluirArquivo("cachorro.txt");
         */

        System.out.println("---------------------------");
        System.out.println("SISTEMA GERENCIADOR DE ARQUIVOS");
        System.out.println("---------------------------");
        System.out.println("[1] Criar um diretório");
        System.out.println("[2] Listar conteúdo diretório");
        System.out.println("[3] Consultar o tamanho de um arquivo");
        System.out.println("[4] Renomear um arquivo");
        System.out.println("[5] Excluir um arquivo");
        System.out.println("[6] Excluir um diretório vazio");
        System.out.println("[7] Sair");

        int opcao = 0;

        while (opcao != 7) {

        System.out.print("\nInforme a opção: ");

            try {
                opcao = Integer.parseInt(scanner.next());

                System.out.println();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o nome do diretório: ");
                        String nomeOpcao1 = scanner.next();

                        teste.criarDiretorio(nomeOpcao1);
                        break;

                    case 2:
                        System.out.print("Informe o nome do diretório: ");
                        String nomeOpcao2 = scanner.next();

                        teste.listarDiretorio(nomeOpcao2);
                        break;

                    case 3:
                        System.out.print("Informe o nome do arquivo: ");
                        String nomeOpcao3 = scanner.next();

                        teste.consultarTamanho(nomeOpcao3);
                        break;
                    case 4:
                        System.out.print("Informe o nome do arquivo: ");
                        String nomeOpcao4 = scanner.next();
                        System.out.print("Informe o novo nome: ");
                        String nomeNovo = scanner.next();

                        teste.mudarNomeArquivo(nomeOpcao4, nomeNovo);
                        break;

                    case 5:
                        System.out.print("Informe o nome do arquivo: ");
                        String nomeOpcao5 = scanner.next();

                        teste.excluirArquivo(nomeOpcao5);
                        break;

                    case 6:
                        System.out.print("Informe o nome do diretório: ");
                        String nomeOpcao6 = scanner.next();

                        teste.excluirDiretorioVazio(nomeOpcao6);
                        break;

                    case 7:
                        System.out.println("*** Sistema encerrado ***");
                        break;

                    default:
                        System.out.println("Por favor, informe um número entre 1-7.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, informe um número inteiro.");
            }
        }
    }
}
