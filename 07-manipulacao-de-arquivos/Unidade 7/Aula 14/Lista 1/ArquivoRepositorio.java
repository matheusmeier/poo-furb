import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArquivoRepositorio {

    public void criarDiretorio(String path) {

        File file = new File(path);

        if (file.isFile()) {
            try {
                if (file.createNewFile()) {
                    System.out.printf("Arquivo criado: %s%n",
                            file.getName());
                } else {
                    System.out.println("Error! Arquivo já existe");
                }
            } catch (IOException e) {
                System.out.println("Um erro ocorreu");
            }
        }

        else {
            if (!file.exists()) {
                file.mkdirs();
                System.out.printf("Diretório criado: %s%n",
                        file.getName());
            } else {
                System.out.println("Diretório já existe");
            }
        }

    }

    public void criarArquivo(String path) {
        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.printf("Arquivo criado: %s%n",
                        file.getName());
            } else {
                System.out.println("Error! Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu algum erro");
        }
    }

    public void listarDiretorio(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            if (file.list().length == 0) {
                System.out.println("O diretório está vazio");
            } else {
                File[] conteudoDiretorio = file.listFiles();

                System.out.printf("Conteúdo da pasta: %s%n%n",
                        file.getName());

                for (File conteudo : conteudoDiretorio) {
                    if (conteudo.isFile()) {
                        System.out.printf("Arquivo: %s | Bytes: %d%n",
                                conteudo.getName(), conteudo.length());
                    } else {
                        System.out.printf("Diretório: %s%n",
                                conteudo.getName());
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Por favor, informe um caminho válido");
        }

    }

    public void criarEstrutura() {
        File sistema = new File("Sistema");

        if (!sistema.exists()) {
            File alunos = new File("Sistema\\Alunos");
            File disciplinas = new File("Sistema\\Disciplinas");
            File documentos = new File("Sistema\\Documentos");

            sistema.mkdirs();
            alunos.mkdirs();
            disciplinas.mkdirs();
            documentos.mkdirs();
        } else {
            throw new IllegalArgumentException("A estrutura já existe.");
        }

    }

    public void mudarNomeArquivo(String path, String newPath) {
        File file = new File(path);
        File newFile = new File(newPath);

        if ((file.exists()) && (file.isFile())) {
            file.renameTo(newFile);
            System.out.printf("Nome do arquivo alterado para: %s%n",
                    newFile.getName());
        } else {
            throw new IllegalArgumentException("Por favor, informe um arquivo válido");
        }
    }

    public void excluirArquivo(String path) {
        File file = new File(path);

        if ((file.exists()) && (file.isFile())) {
            file.delete();
            System.out.printf("Arquivo excluído: %s%n",
                    file.getName());
        } else {
            System.out.println("Por favor, informe um arquivo válido");
        }
    }

    public void consultarTamanho(String path) {
        File file = new File(path);

        if ((file.exists()) && (file.isFile())) {
            System.out.printf("Tamanho do arquivo: %d bytes%n",
                    file.length());
        } else {
            System.out.println("Por favor, informe um arquivo válido");
        }
    }

    public void excluirDiretorioVazio(String path) {
        File file = new File(path);

        if ((file.exists()) && (file.isDirectory())) {

            if (file.list().length == 0) {
                file.delete();
                System.out.printf("Diretório exclúido: %s%n",
                        file.getName());
            } else {
                System.out.println("O diretório informado não está vazio.");
            }

        } else {
            System.out.println("Por favor, informe um diretório válido");
        }
    }
}
