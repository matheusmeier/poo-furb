package models;

public class CachorroQ6 extends AnimalQ6 {
    
    private String raca;

    public CachorroQ6(String nome, int idade, String raca) {
        super(nome, idade);
        setRaca(raca);
    }
    
    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
