public class Carro {

    private String marca;
    private String modelo;
    private double quilometragem;
    private int ano;
    private boolean ligado;
    private String cor;
    private Pessoa dono;
    private Motor motor;
    private double velocidade;
    
    static double velocidadeMaximaPermitida = 110;

    public Carro(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setMotor(motor);
    }

    public Carro(String modelo, double quilometragem, int ano, boolean ligado) {
        setModelo(modelo);
        setQuilometragem(quilometragem);
        setAno(ano);
        setLigado(ligado);
    }

    public Carro(String modelo, double quilometragem, int ano, boolean ligado, Motor motor) {
        setModelo(modelo);
        setQuilometragem(quilometragem);
        setAno(ano);
        setLigado(ligado);
        setMotor(motor);
    }

    public Carro(String modelo, double quilometragem, int ano, boolean ligado, String cor, Pessoa dono) {
        setModelo(modelo);
        setQuilometragem(quilometragem);
        setAno(ano);
        setLigado(ligado);
        setCor(cor);
        setDono(dono);
    }

     public Carro(String modelo, double quilometragem, int ano, boolean ligado, String cor, Pessoa dono, Motor motor) {
        setModelo(modelo);
        setQuilometragem(quilometragem);
        setAno(ano);
        setLigado(ligado);
        setCor(cor);
        setDono(dono);
        setMotor(motor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void acelerar(double valor) {
        this.velocidade += valor;
    }
  
    public static boolean verificarVelocidade(int velocidade) {
        if (velocidade > velocidadeMaximaPermitida) {
            return false;
        }

        return true;
    }
}
