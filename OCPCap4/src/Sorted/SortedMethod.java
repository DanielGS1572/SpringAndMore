package Sorted;

import java.util.Comparator;
import java.util.stream.Stream;

/*
 * Sorted regresa un stream con los elementos ordenados (ordenado natural o a traves de un Comparator)
 * 
 * Stream<T> sorted()
 * Stream<T> sorted(Comparator<? super T> comparator)
 * 
 * */
public class SortedMethod {

	public static void main(String[] args) {
			Stream<String> s1 = Stream.of("brown-", "bear-");
			s1.sorted().forEach(System.out::println);
			System.out.println();
//			Comparator.reverseOrder();			--> es una interfaz funcional que se le puede pasar a sorted
			Stream<String> s2 = Stream.of("brown-", "bear-");
			s2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
			
			
			/*Lo siguiente manda error, investigar por que (ocp: 199, xodo 251)
			Stream<String> s3 = Stream.of("brown-", "bear-");
			s3.sorted(Comparator::reverseOrder);*/
	}

}
