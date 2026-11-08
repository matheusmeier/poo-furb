package models;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class GravarArquivo {

    public void gravarTexto(String path, String text) {
        File file = new File(path);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("ERROR!");
            }
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
    }

    public void adicionarTexto(String path, String text) {
        File file = new File(path);

        if (!file.exists()) {
            throw new IllegalArgumentException("Arquivo não existe");
        }

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("\n" + text);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo");
        }
    }

}
