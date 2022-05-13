import org.junit.Test;
import static org.junit.Assert.*;

import proyecto_factorial.*;

public class FactorialTest {
    
    public FactorialTest() {
    }
    @Test
    public void testC1() throws Exception {
        byte n = 0;
        Factorial instance = new Factorial();
        float expResult = 1F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testC2() throws Exception {
        byte n = 1;
        Factorial instance = new Factorial();
        float expResult = 1F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    public void testC3() throws Exception {
        byte n = 2;
        Factorial instance = new Factorial();
        float expResult = 2F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    public void testC4() throws Exception {
        byte n = 3;
        Factorial instance = new Factorial();
        float expResult = 6F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testC5() throws Exception {
        byte n = 4;
        Factorial instance = new Factorial();
        float expResult = 24F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }
    /*
    @Test
    public void testC6() throws Exception {
        byte n = 127;
        Factorial instance = new Factorial();
        float expResult = 3.0126600184576595448099770775270596923241649186E+213F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }*/
    @Test(expected = Exception.class)
    public void testC7() throws Exception {
        byte n = -1;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
    }
}

