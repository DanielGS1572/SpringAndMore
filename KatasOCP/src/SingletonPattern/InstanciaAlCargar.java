package SingletonPattern;

public class InstanciaAlCargar {
	private static final InstanciaAlCargar instancia = new InstanciaAlCargar();
	private InstanciaAlCargar() {
		
	}
	
	public static synchronized InstanciaAlCargar getInstancia() {
		return instancia;
	}
	
	
}
