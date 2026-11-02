package models;

public class EntregaAgendada extends Entrega {

    public EntregaAgendada(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularFrete() {
        return Math.round(this.getDistancia() * 5);
    }
    
}
