package PutIfAbsent;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentExample {

	public static void main(String[] args) {
		Map<String, String> lista = new HashMap<>();
		lista.put("Jenny", "Bus tour");
		lista.put("Tom", null);
		System.out.println(lista);
		
		System.out.println();
		lista.putIfAbsent("Jenny", "Tram");		/*No agrega ni hace update pues ya tiene llave valor "Jenny"*/
		lista.putIfAbsent("Sam", "Tram");		/*Lo agrega pues no tiene la llave*/
		lista.putIfAbsent("Tom", "Tram");		/*Hace update del valor pues tiene nulo*/
		System.out.println(lista);
		
		/*con merge (del paquete MergeFunction) se puede aplicar regla de negocio para decidir entre dos valores*/
		
	}

}
