import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Pessoa;

public class PessoaTest {
    
    @Test 
    public void testNomeIdadePessoa() {
        Pessoa pessoa = new Pessoa("João", 18);
        assertEquals("João", pessoa.getNome());
        assertEquals(18, pessoa.getIdade());
    }

    @Test 
    public void testNullValuesPessoa() {
        Pessoa pessoa = new Pessoa();
        assertEquals(null, pessoa.getNome());
        assertEquals(0, pessoa.getIdade());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMenorQueDois() {
        Pessoa pessoa = new Pessoa("M", 18);
    }
    
}
