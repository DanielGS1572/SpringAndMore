package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
/*
 * El metodo FlatMap toma cada elemento en el stream y hace cualquiera de los elementos que contenga los convierte a elementos top-level en un solo stream (?)
 * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
 * 
 * */
	public static void main(String[] args) {
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> x = Arrays.asList();
		List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
		
		Stream<List<String>> animals = Stream.of(zero,one,x,two);
		
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		/*Lo que hace es que remueve todos los elementos de la lista vacia y no deja huecos en el primer elemento, haciendo que se vayan ocupando espacios vacios*/
	}

}
