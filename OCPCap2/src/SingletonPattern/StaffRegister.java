package SingletonPattern;

/*Otra forma de hacer un singleton es a traves de un bloque estatico*/

/*Un ejemplo de uso para el singleton pattern es cuando se quiera coordinar el acceso a recursos compartidos
 * Como por ejemplo el acceso a la escritura de un archivo*/
public class StaffRegister {
	private static final StaffRegister instance;
	
	static{
		instance = new StaffRegister();	/*Se instancia en el momento que la clase es cargada*/
	}
	private StaffRegister(){}
	public static StaffRegister getInstance(){
		return instance;
	}
}
