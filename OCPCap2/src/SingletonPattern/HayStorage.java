package SingletonPattern;

public class HayStorage {
	private int quantity = 0;
	private HayStorage(){} //Se crea un constructor private para que por fuera no se pueda instanciar con 
							// new HayStorage();
	/*Para que el patron singleton funcione la variable debe ser de tipo private static
	 * private pues porque si no se podria modificar facilmente con HaySotre.instance
	 * (ver que nada mas se tiene un getter*/
	private static final HayStorage instance = new HayStorage();		/*Se instancia en el momento que la clase es cargada*/
	public static HayStorage getInstance(){		/*Como este metodo es statico instance tambien debe serlo*/
		return instance;
	}
	
	public synchronized void addHay(int amount){
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount){
		if(quantity < amount) return false;
		quantity -= amount;
		return true;
	}
	
	public synchronized int getHayQuantity(){ /*synchronized se usa para evitar que dos procesos usen el 
												al mismo tiempo metodo*/
		return quantity;
	}
}
