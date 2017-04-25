
import java.util.Scanner;

/**
 * Juego Piedra, papel o tijeras 
 * @author Mamen
 *
 */
public class PiedraPapelTijera {
	/**
	 * metodo que realiza el juego
	 */
	 public void juego1(){
		  Scanner teclado=new Scanner(System.in);
		  String usu,cpu;
		  String[] opc={"piedra","papel","tijeras"};
		  
		        System.out.println("Elige:");
		  usu=teclado.next();
		  /**
		   * Genera aleatoriamente la cpu
		   */
		  int num = (int) Math.floor(Math.random()*(2-0+1)+0);   cpu = opc[num];
		  switch (usu) {
		   case "piedra":
		    switch (cpu){
		     case "piedra":
		      System.out.println("CPU elije PIEDRA. EMPATE");
		      break;
		     case "papel":
		      System.out.println("CPU elije PAPEL. Gana CPU");
		      break;
		     case "tijeras":
		      System.out.println("CPU elije TIJERAS. Ganas TU");
		      break;
		    }
		          break;
		      case "papel":
		    switch (cpu){
		    case "piedra":
		     System.out.println("CPU elije PIEDRA. Ganas TU");
		     break;
		    case "papel":
		     System.out.println("CPU elije PAPEL. EMPATE");
		     break;
		    case "tijeras":
		     System.out.println("CPU elije TIJERAS. Gana CPU");
		     break;
		   }
		         break;
		      case "tijeras":
		    switch (cpu){
		    case "piedra":
		     System.out.println("CPU elije PIEDRA. Gana CPU");
		     break;
		    case "papel":
		     System.out.println("CPU elije PAPEL. Ganas TU");
		     break;
		    case "tijeras":
		     System.out.println("CPU elije TIJERAS. EMPATE");
		     break;
		   }
		         break;
		      default:
		          System.out.println("Incorrecto");
		          break;
		  }
	 }
}
		  
		 

