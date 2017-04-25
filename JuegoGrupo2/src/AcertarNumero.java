

import java.util.Scanner;

/**
 * Juego para acertar un número
 * @author FuaFua
 *
 */

public class AcertarNumero {
	
	
	/**
	 * metodo
	 */
public void juego(){
	
	
			/**
			 * variable donde se genera el numero a acertar
			 */
		int aleatorio=(int)(Math.random()*100);

			/**
			 * para introducir datos por consola
			 */
		Scanner entrada=new Scanner(System.in);
		
			/**
			 * numero que introduciremos para acertarlo 
			 */
		int numero=0;
		
			/**
			 * Para indicar los intentos usados
			 */
		int intentos=0;
		
		/**
		 * Bucle que si se acierta el numero se sale de este para finalizar el juego
		 */
		do{
			/**
			 * incrementamos en 1 los intentos a mostrar
			 */
			intentos++;
			
				/**
				 * los dos siguintes son para leer el numero para jugar 
				 */
			System.out.println("Introduce un número: ");
			
			numero=entrada.nextInt();
			
			/**
			 * Esto es una ayuda para indicar si el numero a acertar esta más alto o bajo del numero introducido
			 */
			if(aleatorio<numero){
				
				System.out.println("Esta mas bajo");
				
			}else if(aleatorio>numero){
				
				System.out.println("Esta mas alto");
			}
			
			
		}while (numero!=aleatorio);
		
		
		/**
		 * Esto dice que has acertado y los intentos usados
		 */
		System.out.println("Correcto");
		System.out.println("Has usado " + intentos + " intentos");
		
	}

}

		

	
	


