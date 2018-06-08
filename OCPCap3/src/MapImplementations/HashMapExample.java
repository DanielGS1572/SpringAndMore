package MapImplementations;

import java.util.Map;
import java.util.HashMap;

/*El hashMap almacena las llaves en una tabla hash (y es que la llave puede ser un String y no un entero)
 * esto significa que usa el metodo hashCode()
 * sobre las llaver para regresar los valores mas rapido (el regresar los valores lo hace en un
 * tiempo constante, la desventaja es que estan en desorden (Si el orden importara se usaría 
 * un LinkedHashMap*/

/*Un TreeMap almacena las llaves en una estructura de arbol, el beneficio es que siempre estaran 
 * en orden (no como se fueron introduciendo, si no en orden numerico o alfabetico),
 *  pero para agregar o revisar si una llave esta presente se comporta como O(log n)*/
public class HashMapExample {
	
	/*Metodos interesantes de un HashMap
	 * boolean containsKey(Object key)
	 * boolean containsValues(Object)			
	 * Set<K> keySet()							Regresa un set de todas las llaves
	 * Collection<V> values						Regresa un Collection de todos los valores
	 * 
	 * ... clear, isEmpty, get(Object key), remove(Object key)
	 * */
	public static void main(String args[]){		
		Map<String,String> map = new HashMap<>();
		map.put("koala","bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		System.out.println(map.get("koala"));
		System.out.println("\n");
		
		for(String key: map.keySet()){
			System.out.println(key);
		}
		
		
	}
	

}
