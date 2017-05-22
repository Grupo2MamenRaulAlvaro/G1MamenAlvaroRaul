

import java.util.Scanner;

/**
 * Juego para acertar un n�mero
 * @author FuaFua
 * @version 1.0
 */

public class AcertarNumero {
	
	
	
public void juego(){
	
	/**
	 * Juego que pide un numero al usuario, y lo compara con otro del 1 al 1oo generado automaticamente
	 * El jugador gana cuando acierta el numero generado
	 * @param
	 */
	
	
	
			/**
			 * Genera aleatoriamente un n�mero del 1 al 100
			 * @param
			 */
		int aleatorio=(int)(Math.random()*100);

			/**
			 * Para que pueda leer un numero
			 * @param
			 */
		Scanner entrada=new Scanner(System.in);
		
			
		int numero=0;
			
		int intentos=0;
		
		/**
		 * Bucle que no termina hasta que se introduce el numero correcto
		 * @param
		 */
		do{
			/**
			 * incrementamos en 1 los intentos a mostrar
			 * @param
			 */
			intentos++;
			
				
			System.out.println("Introduce un n�mero: ");
			
			/**
			 * Lee el n�mero introducido
			 * @param
			 */
			numero=entrada.nextInt();
			
			/**
			 * Esto es una ayuda para indicar si el numero a acertar esta m�s alto o bajo del numero introducido
			 * Si el n�mero introducido es mas bajo que el generado, se imprime que esta mas bajo, si no, imprime
			 * que esta m�s alto
			 * @param
			 */
			
			if(aleatorio<numero){
				
				System.out.println("Esta mas bajo");
				
			}else if(aleatorio>numero){
				
				System.out.println("Esta mas alto");
			}
			
			/**
			 * Se esta indicando que si el numero introducido es distinto al generado, que no salga del bucle
			 * @param
			 */
		}while (numero!=aleatorio);
		
		
		/**
		 * Cuando acertamos el n�mero, esto nos dice los intentos utilizados
		 * 
		 */
		System.out.println("Correcto");
		System.out.println("Has usado " + intentos + " intentos");
		
	}

}

		

	
	


