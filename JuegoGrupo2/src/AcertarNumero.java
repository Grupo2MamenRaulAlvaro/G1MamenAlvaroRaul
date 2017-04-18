

import java.util.Scanner;

public class AcertarNumero {

	public static void main(String[] args) {

		int aleatorio=(int)(Math.random()*100);

		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		do{
			intentos++;
			
			System.out.println("Introduce un número: ");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero){
				
				System.out.println("Esta mas bajo");
				
			}else if(aleatorio>numero){
				
				System.out.println("Esta mas alto");
			}
			
			
		}while (numero!=aleatorio);
		
		System.out.println("Correcto");
		System.out.println("Has usado " + intentos + " intentos");
		
	}



		

	}


