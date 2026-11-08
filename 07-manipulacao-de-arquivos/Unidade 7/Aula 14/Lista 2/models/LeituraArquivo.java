package models;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeituraArquivo {
    
    public void lerTexto(String path) {
        File file = new File(path);

        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
        
    }
}
