package calculadoraJUnit;

public class Calculadora {

	private int numero1;
	private int numero2;
	
	public Calculadora(int numero1, int numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;
		
	}
	
	public int suma(){
		return (numero1 + numero2);
		 
	}
	
	public int resta(){
		return (numero1 - numero2);
	}
	
	public int multiplica(){
		return (numero1 * numero2);
	
	}
	
	public Integer divide(){
		return numero1/numero2;
		
	}
	
	 public int resta1(){
		  int resultado;
		  if(resta2()){
			  resultado = numero1 - numero2;
		  }else{
			  resultado = numero2 - numero1;
		  }
		  return resultado;
	  }
	  
	public boolean resta2(){
		  if (numero1 >= numero2){
		  return true;
		  
		  }else{
			  
		  return false;
		  
		  }
	  }
	  
	  public Integer divide2(){
		  
		  if(numero2==0){
			  return null;
		  }
		  
		  return numero1/numero2;
	  }

	

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	  
	System.out.println("me llamo paco");
}
