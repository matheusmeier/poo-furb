import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Calculadora;

public class CalculadoraTest {
    
    @Test 
    public void testSomaCalculadora() {
        Calculadora calculadora = new Calculadora();

        Calculadora ex1 = new Calculadora(10, 5, "+");
        Calculadora ex2 = new Calculadora(0, 10, "+");
        Calculadora ex3 = new Calculadora(0, 0, "+");
        Calculadora ex4 = new Calculadora(-10, 5, "+");
        Calculadora ex5 = new Calculadora(-10, -5, "+");
        Calculadora ex6 = new Calculadora(10.5, 5.5, "+");
        Calculadora ex7 = new Calculadora(1000, 2500, "+");
        Calculadora ex8 = new Calculadora(1.25, 0.75, "+");

        assertEquals(15, calculadora.calcular(ex1), 0.001);
        assertEquals(10, calculadora.calcular(ex2), 0.001);
        assertEquals(0, calculadora.calcular(ex3), 0.001);
        assertEquals(-5, calculadora.calcular(ex4), 0.001);
        assertEquals(-15, calculadora.calcular(ex5), 0.001);
        assertEquals(16, calculadora.calcular(ex6), 0.001);
        assertEquals(3500, calculadora.calcular(ex7), 0.001);
        assertEquals(2, calculadora.calcular(ex8), 0.001);
    }

    @Test 
    public void testSubtracaoCalculadora() {
        Calculadora calculadora = new Calculadora();

        //Subtracao
        Calculadora ex9 = new Calculadora(10, 5, "-");
        Calculadora ex10 = new Calculadora(5, 10, "-");
        Calculadora ex11 = new Calculadora(10, 0, "-");
        Calculadora ex12 = new Calculadora(0, 10, "-");
        Calculadora ex13 = new Calculadora(-10, 5, "-");
        Calculadora ex14 = new Calculadora(-10, -5, "-");
        Calculadora ex15 = new Calculadora(10.5, 5.5, "-");
        Calculadora ex16 = new Calculadora(1000, 250, "-");

        assertEquals(5, calculadora.calcular(ex9), 0.001);
        assertEquals(-5, calculadora.calcular(ex10), 0.001);
        assertEquals(10, calculadora.calcular(ex11), 0.001);
        assertEquals(-10, calculadora.calcular(ex12), 0.001);
        assertEquals(-15, calculadora.calcular(ex13), 0.001);
        assertEquals(-5, calculadora.calcular(ex14), 0.001);
        assertEquals(5, calculadora.calcular(ex15), 0.001);
        assertEquals(750, calculadora.calcular(ex16), 0.001);
    }

    @Test
    public void testMultiplicacaoCalculadora() {
        Calculadora calcualdora = new Calculadora();

        Calculadora ex17 = new Calculadora(10, 5, "*");
        Calculadora ex18 = new Calculadora(10, 0, "*");
        Calculadora ex19 = new Calculadora(0, 100, "*");
        Calculadora ex20 = new Calculadora(-10, 5, "*");
        Calculadora ex21 = new Calculadora(-10, -5, "*");
        Calculadora ex22 = new Calculadora(2.5, 4, "*");
        Calculadora ex23 = new Calculadora(100, 100, "*");

        assertEquals(50, calcualdora.calcular(ex17), 0.001);
        assertEquals(0, calcualdora.calcular(ex18), 0.001);
        assertEquals(0, calcualdora.calcular(ex19), 0.001);
        assertEquals(-50, calcualdora.calcular(ex20), 0.001);
        assertEquals(50, calcualdora.calcular(ex21), 0.001);
        assertEquals(10, calcualdora.calcular(ex22), 0.001);
        assertEquals(10000, calcualdora.calcular(ex23), 0.001);
    }

    @Test
    public void testDivisaoCalculadora() {
        Calculadora calculadora = new Calculadora();

        Calculadora ex24 = new Calculadora(10, 2, "/");
        Calculadora ex25 = new Calculadora(5, 2, "/");
        Calculadora ex26 = new Calculadora(0, 10, "/");
        Calculadora ex27 = new Calculadora(-10, 2, "/");
        Calculadora ex28 = new Calculadora(-10, -2, "/");
        Calculadora ex29 = new Calculadora(7.5, 2.5, "/");

        assertEquals(5, calculadora.calcular(ex24), 0.001);
        assertEquals(2.5, calculadora.calcular(ex25), 0.001);
        assertEquals(0, calculadora.calcular(ex26), 0.001);
        assertEquals(-5, calculadora.calcular(ex27), 0.001);
        assertEquals(5, calculadora.calcular(ex28), 0.001);
        assertEquals(3, calculadora.calcular(ex29), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoPermitirDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();

        Calculadora ex30 = new Calculadora(120, 0, "/");
        calculadora.calcular(ex30);
    }

}
