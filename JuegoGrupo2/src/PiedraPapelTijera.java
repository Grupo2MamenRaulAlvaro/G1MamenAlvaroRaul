
import java.util.Scanner;

/**
 * Juego Piedra, papel o tijeras 
 * @author Mamen
 *
 */
public class PiedraPapelTijera {
	
	// Constantes
	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";
	private static final String PIEDRA = "piedra";
	
	// Atributos
	private String usuario;
	private String cpu;
	
	
	/**
	 * <h1>Constructor por defecto</h1>
	 */
	 public PiedraPapelTijera() {
		
	}
	 
	 
	/**
	 * <h1>Constructor con 2 parametros</h1>
	 * @param usu
	 * @param cpu
	 */
	 public PiedraPapelTijera(String usuario, String cpu) {
		super();
		this.usuario = usuario;
		this.cpu = cpu;
	}


	/**
	 * <h1>Menu del juego</h1>
	 * @return void 
	 */
	@SuppressWarnings("resource")
	public void juego1() {
		Scanner teclado = new Scanner(System.in);

		String[] opc = { PIEDRA, PAPEL, TIJERAS };

		System.out.println("Elige: ");
		usuario = teclado.next();
		
		// Genera aleatoriamente la cpu
		randomGenerateCpu(opc);
		
		switch (usuario) {
		case PIEDRA:
			cpuPiedraCase();
			break;
		case PAPEL:
			cpuPapelCase();
			break;
		case TIJERAS:
			cpuTijerasCase();
			break;
		default:
			System.out.println("Incorrecto");
			break;
		}
	}


	/**
	 * Case de cpu para el caso en que usuario elija Tijeras
	 */
	public void cpuTijerasCase() {
		switch (cpu) {
		case PIEDRA:
			System.out.println("CPU elije PIEDRA. Gana CPU");
			break;
		case PAPEL:
			System.out.println("CPU elije PAPEL. Ganas TU");
			break;
		case TIJERAS:
			System.out.println("CPU elije TIJERAS. EMPATE");
			break;
		}
	}


	/**
	 * Case de cpu para el caso en que usuario elija Papel
	 */
	public void cpuPapelCase() {
		switch (cpu) {
		case PIEDRA:
			System.out.println("CPU elije PIEDRA. Ganas TU");
			break;
		case PAPEL:
			System.out.println("CPU elije PAPEL. EMPATE");
			break;
		case TIJERAS:
			System.out.println("CPU elije TIJERAS. Gana CPU");
			break;
		}
	}


	/**
	 * Case de cpu para el caso en que usuario elija Piedra 
	 */
	public void cpuPiedraCase() {
		switch (cpu) {
		case PIEDRA:
			System.out.println("CPU elije PIEDRA. EMPATE");
			break;
		case PAPEL:
			System.out.println("CPU elije PAPEL. Gana CPU");
			break;
		case TIJERAS:
			System.out.println("CPU elije TIJERAS. Ganas TU");
			break;
		}
	}


	/**
	 * Genera aleatoriamente la cpu
	 * @param opc
	 */
	public void randomGenerateCpu(String[] opc) {
		int num = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
		cpu = opc[num];
	}
	
	
	 /**
	  * Get del atributo usu
	  * @return usu
	  */
	public String getUsu() {
		return usuario;
	}


	/**
	 * Set del atributo usu
	 * @param usu
	 */
	public void setUsu(String usu) {
		this.usuario = usu;
	}


	/**
	 * 
	 * @return
	 */
	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
		  
		 

