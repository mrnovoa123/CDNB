import org.junit.Test;
import static org.junit.Assert.*;

import buscarcaracter.*;

public class OperacionsArraysTest {
    @Test
    public void testBuscaC1() {        
        char C = 'K';
        char[] V = {'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC2() {        
        char C = 'K';
        char[] V = {'J'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC3() {        
        char C = 'K';
        char[] V = {'K','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC4() {
        char C = 'K';
        char[] V = {'J','K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC5() {        
        char C = 'K';
        char[] V = {'J','J'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscaC6() {        
        char C = 'K';
        char[] V = {'A','A','A','A','K','L','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscaC7() {
        char C = 'K';
        char[] V = {'A','A','A','K','L','L','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC8() {        
        char C = 'K';
        char[] V = {'A','A','A','A','A','K','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC9() {
        char C = 'K';
        char[] V = {'A','A','A','A','A','A','A','A','A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC10() {
        char C = 'K';
        char[] V = {'A','A','A','A','K','L','L','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC11() {
        char C = 'K';
        char[] V = {'A','A','A','K','L','L','L','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC12() {
        char C = 'K';
        char[] V = {'A','A','A','A','A','K','L','L','L','L'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    @Test
    public void testBuscaC13() {
        char C = 'K';
        char[] V = {'A','A','A','A','A','A','A','A','A','A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(C, V);
        assertEquals(expResult, result);
    }
    
    @Test(expected=java.lang.NullPointerException.class)
    public void testBuscaC14() {        
        char C = 'K';
        char[] V = null;
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.println("Busca C14: 'K' en array null. Resultado= "+result+"\n");
    }
    @Test(expected=Exception.class)
    public void testBuscaC15() {
        char C = 'K';
        char[] V = {'A','A','A','A','A','A','A','A','A','A','A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.println("Busca C15: 'K' en array de 11 AES. Resultado= "+result+"\n");
    }
    
    @Test(expected=Exception.class)
    public void testBuscaC16() {
        char C = 'K';
        char[] V = {'A','P','S','K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.println("Busca C16: 'K' en array no ordenado sin k. Resultado= "+result+"\n");
    }
    
    @Test(expected=Exception.class)
    public void testBuscaC17() {
        char C = 'K';
        char[] V = {'A','A','A','A','K','A','A','A','A','A'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(C, V);
        System.out.println("Busca C17: 'K' en array AAAAKAAAAA. Resultado= "+result+"\n");
    }
}

