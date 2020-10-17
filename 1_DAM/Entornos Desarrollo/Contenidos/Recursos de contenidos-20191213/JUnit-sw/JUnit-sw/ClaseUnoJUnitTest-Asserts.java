import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Duration;

class ClaseUnoJUnitTest {
	ClaseUnoJUnit miObjUno = new ClaseUnoJUnit();
	
	// Test que comprueba que el metodo devuelve true. Exito
	@Test
	@DisplayName("Comprueba True")
	void testDevuelveTrue() {
		assertTrue(miObjUno.DevuelveTrue());
	}

	// Test que comprueba que el metodo devuelve false. Error
	@Test
	@DisplayName("Comprueba False")
	void testDevuelveFalse() {
		assertFalse(miObjUno.DevuelveTrue());
	}
	
	// El metodo de prueba recibe varios parametros de entrada.
	// Se ejecuta tantas veces como tuplas de parametros se indican.
	// Para valor 1 exito, para valor 2 error.
	@ParameterizedTest
	@CsvSource({"HOLA,1","ADIOS,2"})
	@DisplayName("Comprueba val. Numerico")
	void testParameterizedIntTest(String a, int b) {
		assertEquals(1,miObjUno.DevuelveEnt(a,b));
	}
	
	// Metodo de prueba desactivado.
	@Test
	@Disabled
	void testDesactivado() {
		fail("No se muestra porque esta desactivado");
	}
	
	@Test
	@DisplayName("Tiempo de duracion")
	void testDevuelveTimeOut() {
		assertTimeoutPreemptively(Duration.ofMillis(200), () -> {miObjUno.DevuelveTrue();});
	}	
}
