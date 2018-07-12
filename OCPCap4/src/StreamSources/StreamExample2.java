package StreamSources;

import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		Stream<Integer> infinite1 = Stream.iterate(1, x -> x+1);
		infinite1.limit(5).filter(x -> x%2 == 1).forEach(System.out::print);		//Toma los primeros 5 numeros y los pasa al filter, del 1 al 5 hay solo 3 numeros
		
		System.out.println();
		Stream<Integer> infinite2 = Stream.iterate(1, x -> x+1);
		infinite2.limit(5).peek(System.out::print).filter(x -> x%2 == 1).forEach(System.out::print);	//Ver como la instrucción peek
		//pasa el stream (1,2,3,4,5) y los va encolando con el resultado final por cada elemento del stream (1,3,5)
		
		System.out.println();
		Stream<Integer> infinite3 = Stream.iterate(1, x -> x+1);
		infinite3.filter(x -> x%2 == 1).limit(5).forEach(System.out::println); 		// Todos los 5 primeros numeros impares (ver el orden del limit y del filter
		
		
		/*Como en los streams no se puede poner breakpoints existen alternativas para probar el codigo (*ver tabla 4.5 xodo:256, OCP: 204
		 * Tener en cuenta que los efectos puede resultar en que el stream se destruya (la mayoría son destructivos)*/
	}

}
