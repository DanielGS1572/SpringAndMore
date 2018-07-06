package Reduce;

import java.util.stream.Stream;

/*El metodo reduce combina un stream en un solo objeto (es una reducción)
 * 
 * 
 * T reduce(T identity, BinaryOperator<T> accumulator)
 * Optional<T> reduce(BinaryOperator<T> accumulator)
 * <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
 * 
 * 
 * */
public class ReduceT {

	public static void main(String[] args) {
	/* Para el caso de la siguiente firma
	 * 
	 * T reduce(T identity, BinaryOperator<T> accumulator)
	 * 
	 * identity es el caso base, por ejemplo en una mutliplicación seria un 1, en el caso de concatenar un string sería un string vacío
	 * Supongo que es algo como recursión
	 * */
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", String::concat);
		System.out.println(word);
		
		Stream<Integer> intStream = Stream.of(2,3,4);
		Integer mult = intStream.reduce(1, (a,b) -> a*b);		/*Hay caso en los que el identity no es necesario, en caso que no se ponga regresa un Optional (ver linea 9)*/
		System.out.println(mult);

	}

}
