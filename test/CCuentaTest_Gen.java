import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;


import TareaSW.CCuenta;

public class CCuentaTest_Gen {
	CCuenta miCuenta = new CCuenta();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test1() {
		assertEquals(1,miCuenta.ingresar(-10));
	}
	
	@Test
	public void test2() {
		assertEquals(2,miCuenta.ingresar(-3));
	}
	
	@Test
	public void test3() {
		assertEquals(0,miCuenta.ingresar(10));
	}
	
	//@CsvSource({"-10,1","-3,2","10,0"})
	//@DisplayName("Caja Blanca - Ingresar")
}
