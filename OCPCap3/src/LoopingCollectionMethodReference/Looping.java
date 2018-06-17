package LoopingCollectionMethodReference;

import java.util.Arrays;
import java.util.List;

public class Looping {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("uno,", "dos,", "tres,", "cuatro");
		
		/*forEach usa consumer, que se le pasa un parametro pero no regresa ningun valor*/
		lista.forEach(c -> System.out.print(c));
		System.out.println();
		lista.forEach(System.out::print);

	}

}
