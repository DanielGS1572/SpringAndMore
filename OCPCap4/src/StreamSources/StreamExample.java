package StreamSources;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();				//Empty stream, count = 0
		Stream<Integer> singleElemetn = Stream.of(1);		//Stream con un solo elemento
		Stream<Integer> fromArray = Stream.of(1,2,3);		//Stream de array, usa varargs en el argumento
		
		/*Una forma de convertir una lista a stream y parallelStream*/
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();			/*Conviene cuando son muchos elementos, cuando son pocos puede no ser buena idea*/
		
		
//		Stream<Double> randoms = Stream.generate(Math::random);				/*Genera numeros aleatorios hasta que se mate el proceso*/
//		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);
		
		/*Algunos metodos hacen terminar... Ver tabla 4.4 (Xodo 242, OCP 190)*/
		//count() --> se cuelga cuando es infinito y no termina 
		
		Stream<String> s = Stream.of("monkey","ape","bonobo");
		Optional<String> min = s.min((s1,s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println);

	}

}
