package Filter;

import java.util.stream.Stream;

public class FilterExample {
	/*
	 * Firma
	 * Stream<T> filter(Predicate<? super T> predicate)
	 * 
	 * */

	public static void main(String[] args) {
			Stream<String> s = Stream.of("monkey","gorilla","bonobo","marimba");
			s.filter(x -> x.startsWith("m")/*Predicate*/).forEach(System.out::println/*Consumer*/);

	}

}
