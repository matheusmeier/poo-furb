package models;

public class EntregaExpressa extends Entrega {

    public EntregaExpressa(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularFrete() {
        return Math.round(this.getDistancia() * 20);
    }
    
}
