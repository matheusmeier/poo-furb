package models;

public class Galinha extends Animal {

    public Galinha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Cocoricó";
    }
}
