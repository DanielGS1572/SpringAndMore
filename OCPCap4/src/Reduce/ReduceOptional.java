package Reduce;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceOptional {

	public static void main(String[] args) {
		/*
		 *  Optional<T> reduce(BinaryOperator<T> accumulator)
		 * */
		BinaryOperator<Integer> op = (a,b) -> a*b;
		
		Stream<Integer> emptyStream = Stream.empty();
		Stream<Integer> oneStream = Stream.of(3);
		Stream<Integer> moreStream = Stream.of(4,5,6);
		
		emptyStream.reduce(op).ifPresent(System.out::println);			/*no output*/
		oneStream.reduce(op).ifPresent(System.out::println);
		moreStream.reduce(op).ifPresent(System.out::println);
		
		/*Hay casos en los que ni siquiera es necesario poner un identity pues es posible que el Stream venga vacio, en cambio si se pone el identity y el Stream
		 * viene vacio se usará el identity*/
	}

}
