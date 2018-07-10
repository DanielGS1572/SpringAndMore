package map;

import java.util.stream.Stream;

public class mapMethod {
/*El metodo map crea un mapeo uno a uno de los elementos del stream a los elementos del siguiente paso del stream
 * 
 * <R> Stream<R> map(Function<? super T, ? extends R> mapper)
 * 
 * El metodo map se usa para transformar información
 * 
 * 
 * */
	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
		s1.map(x -> x.length()).forEach(System.out::println);
		System.out.println();
		s2.map(String::length).forEach(System.out::println);
	}

}
