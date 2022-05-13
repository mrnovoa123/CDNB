import org.junit.Test;

import divisores_Eval.*;

import static org.junit.Assert.*;

/**
 *
 * @author Profesor
 */
public class DivisoresEvalTest {  
    /**
     * Test of obterDivisores method, of class Divisores.
     * @throws java.lang.Exception
     */
    @Test
    public void C1() throws Exception{
        byte n=1;
        Divisores instance = new Divisores();
        String expResult = "1";
        String result = instance.obterDivisores(n);
        assertEquals(expResult, result);
    }
    @Test
    public void C2() throws Exception{
        byte n=127;
        Divisores instance = new Divisores();
        String expResult = "1 127";
        String result = instance.obterDivisores(n);
        assertEquals(expResult, result);
    }
    @Test
    public void C3() throws Exception{
        byte n=2;
        Divisores instance = new Divisores();
        String expResult = "1 2";
        String result = instance.obterDivisores(n);
        assertEquals(expResult, result);
    }
    @Test
    public void C4() throws Exception{
        byte n=126;
        Divisores instance = new Divisores();
        String expResult = "1 2 3 6 7 9 14 18 21 42 63 126";
        String result = instance.obterDivisores(n);
        assertEquals(expResult, result);
    }
    @Test(expected = Exception.class)
    public void C5() throws Exception{
        byte n=0;
        System.out.println("C5. n=0");
        Divisores instance = new Divisores();
        String result = instance.obterDivisores(n);
    }
}
