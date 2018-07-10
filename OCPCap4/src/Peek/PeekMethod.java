package Peek;

import java.util.stream.Stream;

/*
 * El metodo peek es usado para debuggea porque permite hacer operaciones a un stream sin modificarlo
 * 
 * Stream<T> peek(Consumer<? super T> action)
 * 
 * El uso mas comun es dar salida de contenido de un stream como se va presentando
 * 
 * */
public class PeekMethod {

	public static void main(String[] args) {
			Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
			long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
			System.out.println(count);
	}

}
