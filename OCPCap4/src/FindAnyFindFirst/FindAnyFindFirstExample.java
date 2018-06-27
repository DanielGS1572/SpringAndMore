package FindAnyFindFirst;

import java.util.stream.Stream;

/*La firma de los metodos es
 * Optional<T> findAny()
 * Optional<T> findFirst()
 * Son operaciones terminales (terminan los streams que son infinitos, pero no son de tipo reduction
 * */

public class FindAnyFindFirstExample {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		Stream<String> infinite = Stream.generate(()->"chimp");
		s.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);

	}

}
