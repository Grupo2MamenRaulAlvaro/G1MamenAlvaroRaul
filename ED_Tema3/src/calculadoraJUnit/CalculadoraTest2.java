package calculadoraJUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



	@RunWith (Parameterized.class)
	public class CalculadoraTest2{
		
		private int numero1;
		private int numero2;
		private int result;
		
		public void CalculadoraTest4(int numero1, int numero2, int result){
			this.numero1 = numero1;
			this.numero2 = numero2;
			this.result = result;
		}
		
		@Parameters
		public static Collection<Object []> numeros(){
			return Arrays.asList(new Object[][]{
				{20, 10, 2}, {30, -2, -15}, {5, 2, 3}
				
			});
		}
		
		@Test
		public void testDivide() {
			Calculadora calculadora = new Calculadora (numero1, numero2);
			int resultado = calculadora.divide();
			assertEquals(result, resultado);
		}
	}
	
	


