package Reduce;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceParallel {
//No me queda claro, como es que el resultado es 90?
	public static void main(String[] args) {
		/*
		 * <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
		 * */
		
		//Se usa para procesar collections en paralelo, o en su defecto streams en paralelo
		
		BinaryOperator<Integer> op = (a,b) -> a*b;
		Stream<Integer> stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(1, op, op));
	}

}
