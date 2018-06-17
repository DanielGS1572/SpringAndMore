package RemoveIf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*Hay dos metodos de List que recibe como parametro lambdas, 
 * estos son:
 * 
 * 		- removeIf
 * 		- replaceAll
 * */
public class RemoveIfExample {
	public static void main(String[] args) {
		Predicate<String> starts = s -> s.startsWith("z"); /*No se puede por method reference, puesto
		que recibe como parametro a algo diferente a s (en este caso "z"*/
		List lista1 = new ArrayList(Arrays.asList("aa","ab","zb"));		/*Remueve la z*/
		lista1.removeIf(starts);
		System.out.println(lista1);
		
		System.out.println();
		List<Integer> lista2 = Arrays.asList(1,2,3);
		lista2.replaceAll(x -> x*2);
		System.out.println(lista2);
		
	}

}
