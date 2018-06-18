package ComputeIfAbsent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputeIfAbsent {

	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny",15);
		counts.put("Tom", null);
		
		/*ComputeIfAbsent setea los valores si la llave viene nula ó si no existe el elemento en la lista*/
		Function<String,Integer> mapper = (k) -> 1;		/*Simplemente recibe un valor y regresa un integer*/
		System.out.println(counts);
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);
		Integer sam = counts.computeIfAbsent("Sam", mapper);		//NO EXISTE EN LA LISTA
		Integer tom = counts.computeIfAbsent("Tom", mapper);		//LLAVE NULA
		
		System.out.println(counts);
	}

}
