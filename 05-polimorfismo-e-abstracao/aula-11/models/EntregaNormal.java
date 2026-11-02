package models;

public class EntregaNormal extends Entrega {

    public EntregaNormal(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularFrete() {
       return Math.round(this.getDistancia() * 10);
    }
    
}
