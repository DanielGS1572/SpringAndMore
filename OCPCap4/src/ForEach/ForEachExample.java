package ForEach;

import java.util.stream.Stream;

/*
 * Firma:
 * void forEach(Consumer<? super T> action)
 * 
 * 
 * Es una operacion terminal para los streams
 * */
public class ForEachExample {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey","Gorila","Bonobo");
		s.forEach(System.out::print);		/*Ver que se le pasa un Consumer*/

	}

}
