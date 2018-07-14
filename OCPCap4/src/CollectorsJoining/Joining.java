package CollectorsJoining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {

	public static void main(String[] args) {
		Stream<String> test1 = Stream.of("lions","tigers","bears");
		String result  = test1.collect(Collectors.joining(", "));
		System.out.println(result);
		
		Stream<String> test2 = Stream.of("lions","tigers","bears");
		System.out.println(test2.collect(Collectors.averagingDouble(String::length)) + "");

	}

}
