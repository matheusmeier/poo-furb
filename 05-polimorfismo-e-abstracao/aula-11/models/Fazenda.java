package models;

import java.util.ArrayList;

public class Fazenda {
    
    private ArrayList<Animal> animais;

    public Fazenda(ArrayList<Animal> animais) {
        setAnimais(animais);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void mostrarFazenda() {
        for (Animal animal: this.getAnimais()) {
            System.out.printf("%s faz: %s!%n",
                                    animal.getNome(),
                                    animal.emitirSom()
            );
        }
    }

    
}
