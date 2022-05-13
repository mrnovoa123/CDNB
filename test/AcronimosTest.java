import org.junit.Test;
import static org.junit.Assert.*;

import proyecto_acronimos.*;

public class AcronimosTest {
    
    public AcronimosTest() {
    }
    @Test
    public void testObtenerAcronimo() {
        System.out.println("testObtenerAcronimo");
        Acronimos instance = new Acronimos();
        
        String result = instance.obtenerAcronimo("");
        assertEquals("", result);
        System.out.println("Caso C1: -"+result+"-");
        
        result = instance.obtenerAcronimo("A");
        assertEquals("A.", result);
        System.out.println("Caso C2: -"+result+"-");
       
        result = instance.obtenerAcronimo(" ");
        assertEquals("", result);
        System.out.println("Caso C3: -"+result+"-");
        
        String cadena = "   ";
        result = instance.obtenerAcronimo(cadena);
        assertEquals("", result);
        System.out.println("Caso C4: -"+result+"-");
        
        result = instance.obtenerAcronimo("  UNHA OUTRA");
        assertEquals("U.O.", result);
        System.out.println("Caso C5: -"+result+"-");
        
        result = instance.obtenerAcronimo("UNHA OUTRA  ");
        assertEquals("U.O.", result);
        System.out.println("Caso C6: -"+result+"-");
        
        result = instance.obtenerAcronimo("UNHA  OUTRA");
        assertEquals("U.O.", result);        
        System.out.println("Caso C7: -"+result+"-");
        
        result = instance.obtenerAcronimo("UNHA .OUTRA");
        assertEquals("U...", result);
        System.out.println("Caso C8: -"+result+"-");
    }
}

