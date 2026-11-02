public class Motor {
    private int potencia;
    private double cilindrada;
    private String combustivel;

    public Motor(int potencia, double cilindrada, String combustivel) {
        setPotencia(potencia);
        setCilindrada(cilindrada);
        setCombustivel(combustivel);
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return this.combustivel;
    }
}
