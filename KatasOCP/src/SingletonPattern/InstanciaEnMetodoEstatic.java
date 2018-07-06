package SingletonPattern;

/*Otra forma de hacer un singleton es a traves de un bloque estatico*/

/*Un ejemplo de uso para el singleton pattern es cuando se quiera coordinar el acceso a recursos compartidos
 * Como por ejemplo el acceso a la escritura de un archivo*/
public class InstanciaEnMetodoEstatic {
	private static final InstanciaEnMetodoEstatic instance;
	
	static{
		instance = new InstanciaEnMetodoEstatic();	/*Se instancia en el momento que la clase es cargada*/
	}
	private InstanciaEnMetodoEstatic(){}
	public static InstanciaEnMetodoEstatic getInstance(){
		return instance;
	}
}
