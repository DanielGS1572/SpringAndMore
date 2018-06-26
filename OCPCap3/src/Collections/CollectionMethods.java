package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMethods {

	public static void main(String args[]){
//add()
	//boolean add(E element)
	//la firma de add regresa un booleano, en el caso de List siempre regresara true
	//sin embargo en un set no siempre, pues el elemento puede que ya exista, de esta forma regresara false
		System.out.println("add");
		Set<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
		
		
		
//remove()
	//boolean remove(Object object)
	//Solo elemina un solo elemento a la vez, tomar en cuenta que si se le pasa un numero, borrara el elemento
	//que corresponda a ese indice, si se tuviera un entero y se quisiera borrar el correspondiente objeto
	//seria remove(new Integer(3)) pues una lista nunca trabaja con primitivos
		System.out.println();
		System.out.println("remove");
		
		List<Integer> listaEnteros = new ArrayList(Arrays.asList(3,4,3,8,10));
		System.out.println(listaEnteros);
		listaEnteros.remove(new Integer(3));			//El remove solo remover� la primera coincidencia
		System.out.println(listaEnteros);
		listaEnteros.remove(3);							//Tener cuidado con remover indices vs objetos en una 
														//lista de Integers
		System.out.println(listaEnteros);
		
//isEmpty()		--> 	boolean isEmpty();
//size()		-->		int size();				ver que en arreglos es una propiedad length, no es un metodo	
//clear()		--> 	void clear();
//contains()	-->		boolean contains(Object object)		--> este metodo llama a equals() en cada elementos 
															//del arraylist (va barriendo por cada uno)
		
		Map<Integer,String> mapa = new HashMap<>();
		mapa.put(1, "uno");
		mapa.put(2, "dos");
		mapa.put(null, "nulo");											/*Ver como el mapa si acetpa nulos, tanto en sus llaves como en sus valores*/
		mapa.put(3, null);
		mapa.put(null, null);
		for(Map.Entry<Integer, String> entry: mapa.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
