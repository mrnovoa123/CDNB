import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import TareaSW.CCuenta;

public class CCuentaTest {
	CCuenta miCuenta = new CCuenta();

	@ParameterizedTest
	@CsvSource({"-10,1","-3,2","10,0"})
	@DisplayName("Caja Blanca - Ingresar")
	void testIngreso(double cant,int resul) {
		assertEquals(resul,miCuenta.ingresar(cant));
	}
}
