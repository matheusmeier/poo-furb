package models;

public class Calculadora {
    
    private double valor1;
    private double valor2;
    private String operacao;

    public Calculadora() {
    }

    public Calculadora(double valor1, double valor2, String operacao) {

        setValor1(valor1);
        setValor2(valor2);
        setOperacao(operacao);

    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double calcular(Calculadora calculadora) {

         if ((calculadora.getOperacao() !="+") &&
            (calculadora.getOperacao() !="-") &&
            (calculadora.getOperacao() !="/") &&
            (calculadora.getOperacao() !="*") 
        ) {
            throw new IllegalArgumentException("Operação inválida");
        }

        if ((calculadora.getOperacao().equals("/")) &&
            (calculadora.getValor2() == 0)) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }


        switch (calculadora.getOperacao()) {
            case "+":
                return (calculadora.getValor1() + calculadora.getValor2());

             case "-":
                return (calculadora.getValor1() - calculadora.getValor2());

             case "*":
                return (calculadora.getValor1() * calculadora.getValor2());

             case "/":
                return (calculadora.getValor1() / calculadora.getValor2());

            default:
                return 0;
        }
    }

    
}
