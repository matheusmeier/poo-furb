import models.Aluguel;

public class main {
    public static void main(String[] args) {

        Aluguel aluguel1 = new Aluguel(1, 9);
        Aluguel aluguel2 = new Aluguel(3, 4);
        
        System.out.println(aluguel1.calcularValorAluguel());
        System.out.println(aluguel2.calcularValorAluguel());
               
    }
}
