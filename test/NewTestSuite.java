/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author MariaRN
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CCuentaTest_Gen.class, DivisionTest_old.class, DivisoresEvalTest.class, ClaseUnoJUnitTest.class, FactorialTest.class, CCuentaTest.class, AcronimosTest.class, OperacionsArraysTest.class})
public class NewTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
