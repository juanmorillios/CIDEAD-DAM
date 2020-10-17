
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ClaseUnoJUnitTest {

	// Llamada al metodo una sola vez antes de todos los test
	@BeforeAll
	static void MetodoBeforeAll() {
		System.out.println("Llamando a MetodoBeforeAll");
	}
	
	// Llamada al metodo una vez despues de todos los test
	@AfterAll
	static void MetodoAfterAll() {
		System.out.println("Llamando a MetodoAfterAll");
	}

	// Llamada al metodo antes de cada metodo de prueba
	@BeforeEach
	void MetodoBeforeEach() {
		 System.out.println("Llamando a MetodoBeforeEach");
	}

	// Llamada al metodo despues de cada metodo de prueba
	@AfterEach
	void MetodoAfterEach() {
		 System.out.println("Llamando a MetodoAfterEach");
	}
	
	// Metodo etiquetado para ser probado
	@Test
	void testDevuelveTrue() {
		System.out.println("Llamando a testDevuelveTrue");
	}

	// Metodo etiquetado para ser probado 2 veces
	
	@RepeatedTest(2)
	void testRepiteTest() {
		System.out.println("Llamando a testRepiteTest");
	}

	// El metodo de prueba recibe un parametro de entrada.
	// Se ejecuta tantas veces como parametros se indican.
	@ParameterizedTest
	@ValueSource(strings = {"HOLA","ADIOS"})
	void testParameterizedTest(String sMiImput) {
		System.out.println("Llamando a testParameterizedTest " + 
		sMiImput  );
	}

	// El metodo de prueba recibe varios parametros de entrada.
	// Se ejecuta tantas veces como tuplas de parametros se indican.
	@ParameterizedTest
	@CsvSource({"HOLA,1","ADIOS,2"})
	void testParameterizedIntTest(String a, int b) {
		System.out.println("Llamando a testParameterizedIntTest : " 
		+ a  + "--- " + b);
	}
	
	// Metodo de prueba desactivado.
	@Test
	@Disabled
	void testDesactivado() {
		System.out.println("Desactivada la llamada a testDesactivado");
	}
}
