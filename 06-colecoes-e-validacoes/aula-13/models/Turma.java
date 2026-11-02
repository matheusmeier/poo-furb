package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Turma {
    
    private ArrayList<Double> notas;

    public Turma() {

    }

    public Turma(ArrayList<Double> notas) {
        this.notas = new ArrayList<>();

        setNotas(notas);
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        
        double somaNotas = 0;

        for (double nota: notas) {
            somaNotas += nota;
        }

        return (somaNotas/ notas.size());
    }

    public void mostrarNotas() {
        for (int c = 0; c < notas.size(); c++) {
            System.out.printf("Nota %d: %.2f%n", c+1, notas.get(c));
        }
    }

    public double consultarNota(int indice) {
        return this.notas.get(indice);
    }
}
