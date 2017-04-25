
/**
 *
 * @author Raul
 *
 */
public class CaraOCruz {
		 
		 
		/**
		 * Juego que lanza la moneda
		 */
		 	public void caraOCruz(){
	
		   
		   int aleatorio = (int)(Math.random()*100);
		   
		   if (aleatorio>=50){
			   System.out.println("Es cara");
		   }else if (aleatorio <=49){
			   System.out.println("Es cruz");
		   }
			   
	   }

}
