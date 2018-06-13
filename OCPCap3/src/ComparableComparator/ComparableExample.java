package ComparableComparator;
/*La interfaz Comparable se usa para ordenar objetos propios, también para compararlos
 * 			La definicion de la interfaz comparabla es:
 * 				public interface Comparable<T>{
 * 					public int compareTo(T o);
 * 				}
 * 
 * Los valores que debe regresar compareTo son
 * 	0: el objecto es igual al argumento que se le pasa
 *  <0: el objeto es menor al argumento que se le pasa
 *  >0: el objeto es mayor al argumento que se le pasa
 *  (ESTOS VALORES SE REGRESAN PROGRAMADOS DESDE UN RETURN)
 * 
 * Comparator.- se usa para asignar un orden diferente del que el objeto provee como tal
 * 
 *  */
public class ComparableExample implements Comparable<ComparableExample> {
	private int id;
	public int compareTo(ComparableExample compara){
		return id - compara.id;
	/*id - compara.id 	--> 	ascending
	 *compara.id - id 	-->		descending*/	
	}

	public static void main(String[] args) {
		ComparableExample a1 = new ComparableExample();
		a1.id = 8;
		ComparableExample a2 = new ComparableExample();
		a2.id = 10;
		ComparableExample a3 = new ComparableExample();
		a3.id = 8;
		System.out.println(a1.compareTo(a2));
		System.out.println(a2.compareTo(a1));
		System.out.println(a1.compareTo(a3));
		
		
		/*Ver que el wrapper de integer tiene su compareTo, pero lo hace mal pues no regresa un valor
		 * correcto, esta regresando -1, por lo que es mejor definir uno propio*/
		Integer i1 = new Integer(8);
		Integer i2 = new Integer(10);
		System.out.println(i1.compareTo(i2));
		
		/*LEGACY CODE.- Como antes no se usaban Genericos, es necesario castear el Object
		 * public class LegacyDuck implement Comparable{
		 * 	private String name;
		 * 
		 * 	public int compareTo(Object obj){
		 * 		Legacy d = (LegacyDuck) obj;
		 * 		return name.compareTo(d.name);
		 *  }
		 * }*/
		
		/*Se debe ser consistente en los resultados entre equals y compareTo, si uno regresa true, el 
		 * otro debe de regresar 0 SIEMPRE, el tema esta en lo que regresa el 0... se compara con lo 
		 * mismo que en el equals?, si esto no se cumple se puede hacer un fix con Comparator*/
	}

}
