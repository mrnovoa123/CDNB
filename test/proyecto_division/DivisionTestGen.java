/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_division;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MariaRN
 */
public class DivisionTestGen {
    
    public DivisionTestGen() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularDivision method, of class Division.
     */
    @Test
    public void testCalcularDivision_0_0() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0.0F;
        float divisor = 0.0F;
        Division instance = new Division();
        float expResult = 0.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalcularDivision_1_3() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1F;
        float divisor = 3F;
        Division instance = new Division();
        float expResult = 0.33F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 1E-2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDivision method, of class Division.
     */
    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0.0F;
        float divisor = 0.0F;
        Division instance = new Division();
        float expResult = 0.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     
}
