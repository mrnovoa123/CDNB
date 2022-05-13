import org.junit.Test;
import static org.junit.Assert.*;

import proyecto_division.*;

public class DivisionTest_old {

    @Test
    public void testC1() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.40130E-45F, 1.40130E-45F);
        assertEquals(1F, resultado, 0);
    }
    @Test
    public void testC2() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(3.40282E+38F, 3.40282E+38F);
        assertEquals(1F, resultado, 0);
    }
    @Test
    public void testC3() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.40130E-45F, 3.40282E+38F);
        assertEquals(4.1181E-84, resultado,1E-5);
    }  
    @Test
    public void testC4() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(3.40282E+38F, 1.40130E-45F);
        assertEquals(2.4283E+083, resultado, 0);
    }
    @Test
    public void testC5() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(1F, 3F);
        assertEquals(3.3333E-001, resultado, 1E-2);
    }       
    @Test
    public void testC6() throws Exception {
        Division instance = new Division();
        float resultado = instance.calcularDivision(0F, 1.40130E-45F);
        assertEquals(0, resultado, 0);
    }
    @Test(expected = Exception.class)
    public void testC7() throws Exception {        
        Division instance = new Division();
        instance.calcularDivision(1.40130E-45F, 0F);
        //No habrá assertEquals, ya que se sabe con antelación que dará error
    } 
}

