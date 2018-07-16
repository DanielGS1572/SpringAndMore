package MergeFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class merge1 {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1 : v2;		/*Recibe dos parametro y regresa uno del mismo tipo*/
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus tour");
		favorites.put("Tom", "Tram");
		favorites.put("Dan", null);
		
		/*v1, serÌa el valor de lo que la llave Jenny contiener por ejemplo*/
		String jenny = favorites.merge("Jenny", "SkyRide", mapper);			/*Key, value, Bifunction --> recibe como parametros*/
		String tom = favorites.merge("Tom","SkyRide", mapper);				/*Compara SkyRide y Bus Tour y a traves de mapper regresa el valor de bus tour por ser mayor*/			
		String dan = favorites.merge("Dan","SkyRide", mapper);				/*Si la llave viene nula, mete a SkyRide como el valor y nunca se usa el mapper, de lo contrario tronaria*/
		
		
		/*La funcion de mapping es usada cuando hay dos valores por los que hay que decidir --> aplica regla de negocio a diferencia de PutIfAbsent*/
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
		System.out.println(dan);

		

		
		System.out.println();
		System.out.println();
		/*si el mapping function regresa nulo, vuela el elemento de la lista, el siguiente ejemplo se vuela todo lo que s√≠ este en la lista
		 * pues el mapping function siempre estara regresando nulo*/
		BiFunction<String, String, String> mapper2 = (v1,v2) -> null;	
		Map<String, String> lista2 = new HashMap();
		lista2.put("Jenny", "Bus tour");
		
		lista2.merge("Jenny", "SkyRide", mapper2);
		lista2.merge("Sam", "SkyRide", mapper2);				/*Como Sam no esta en lista2... lo deja*/
		System.out.println(lista2);
		
		/*BiFunction siempre es llamada cuando el valor de (k,v) es diferente de nulo*/
	}

}
