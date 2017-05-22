
/**
 *
 * @author Raul
 * @version 25/04/2014
 */
public class CaraOCruz {
		 
		 
		/**
		 * Juego que lanza la moneda.
		 * 
		 */
		 	public void caraOCruz(){
	
		   
		   int aleatorio = (int)(Math.random()*100);
		 /**
		  * @param es un bucle que te dice si la moneda es cara o cruz.
		  */
		   if (aleatorio>=50){
			   System.out.println("Es cara");
		   }else if (aleatorio <=49){
			   System.out.println("Es cruz");
		   }
			   
	   }

}
