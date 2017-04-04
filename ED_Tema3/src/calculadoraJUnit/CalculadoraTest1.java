package calculadoraJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest1 {
	private Calculadora calculadora;
	
	@Before
	public void inicializarAntes(){
		calculadora = new Calculadora(20, 10);
		
	}

	@Test
	public void testSuma() {
		/*
		 * fail("Not yet implemented");
		 */

		// Implementamos el metodo
		// Suma
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		/*
		 * fail("Not yet implemented");
		 */
		// Resta
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplicar() {
		/*
		 * fail("Not yet implemented");
		 */

		// Multiplicacion
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	public void testDivision() {
		/*
		 * fail("Not yet implemented");
		 */

		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.divide();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta1() {
		/*
		 * fail("Not yet implemented");
		 */
		// Resta
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.resta1();
		assertEquals(10, resultado);
	}

	@Test
	public void testResta2TestVerdadero() {
		/*
		 * fail("Not yet implemented");
		 */
		
		//Hay q hacerles dos pruebas pq seria para n1 >= n2
		// Resta
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		boolean resultado = calculadora.resta2();
		assertTrue(resultado);
	}
	@Test
	public void testResta2TestFalso() {
		/*
		 * fail("Not yet implemented");
		 */
		
		//Hay q hacerles dos pruebas pq seria para n1 >= n2
		// Resta
		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		boolean resultado = calculadora.resta2();
		assertFalse(resultado);
	}

	@Test
	public void testDivide2Null() {
		/*
		 * fail("Not yet implemented");
		 */

		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.divide();
		assertNull(resultado);
	}
	
	@Test
	public void testDivide2() {
		/*
		 * fail("Not yet implemented");
		 */

		calculadora.setNumero1(20);
		calculadora.setNumero2(10);
		int resultado = calculadora.divide();
		assertEquals(8, resultado);
	}
	
	
	@After
	
	public void fin(){
		
		calculadora = null;
		
	}

}
