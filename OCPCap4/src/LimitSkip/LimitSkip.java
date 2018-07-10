package LimitSkip;

import java.util.stream.Stream;

/*Los metodos de limit y skip hacen un Stream mas pequeño
 * 
 * Stream<T> limit(int maxSize)
 * Stream<T> skip(int n)
 * 
 * 
 */
public class LimitSkip {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(1, n->n+1);		//Stream infinito
		s.skip(5).limit(2).forEach(System.out::println); 	//Se brinca los primeros 5 y limita a los siguientes dos elementos y por cada uno manda a imprimir
	}

}
