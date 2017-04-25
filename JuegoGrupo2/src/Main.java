
import java.util.*;


/**
 * Proyecto Juegos
 * @author Mamen, Alvaro, Raúl
 *
 */
public class Main {


	
	static Scanner input=new Scanner (System.in);
	
	public static void main(String[] args) {
		
		/**
		 * Menu de las diferentes opciones del juego
		 */
		int opcion = 1;
		while(opcion != 0){
			
			System.out.println("-------------------------------");
			System.out.println("------ Elije un juego: ------- ");
			System.out.println("-------------------------------");
			System.out.println("--- 1. Piedra, papel o tijera -");
			System.out.println("--- 2. Cara o cruz.------------");
			System.out.println("--- 3. Acertar número ---------");
			System.out.println("--- 0. Salir ------------------");
			System.out.println("-------------------------------");
			
			 opcion = input.nextInt();


			/**
			 * Condiciones que deben de cumplir para poder elegir un juego
			 */
			if (opcion == 1){
				
				
				PiedraPapelTijera juego1 =new PiedraPapelTijera();
				 juego1.juego1();
				
			}else if(opcion == 2){
				
				CaraOCruz juego2 =new CaraOCruz();
				juego2.caraOCruz();
				
			}else if(opcion == 3){
				AcertarNumero juego3 =new AcertarNumero();
				juego3.juego();
				
			}else if(opcion == 0){
				System.out.println("No deseo jugar más");
			}
			
			
		}
		
		

	}

}
