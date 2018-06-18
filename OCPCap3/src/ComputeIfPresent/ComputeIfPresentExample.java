package ComputeIfPresent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIfPresentExample {

	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny",1);
		
		BiFunction<String,Integer,Integer> mapper = (k,v) -> v+1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper);			/*Si hay llave presente hace el calculo*/
		Integer sam = counts.computeIfPresent("Sam", mapper);				/*Si no hay llave, regresa nulo*/

		System.out.println(counts);
		System.out.println(jenny);			/*Regresa el valor del calculo de v+1*/
		System.out.println(sam);
		
				
	}

}
