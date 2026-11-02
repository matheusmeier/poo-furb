package models;

public class Caminhao extends Veiculo {
    
    public Caminhao(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override 
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
    }

    @Override 
    public double calcularImposto() {
        return Math.round(this.getValor() * .3);
    }
}
