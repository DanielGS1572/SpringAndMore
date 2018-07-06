package Collect;

import java.util.TreeSet;
import java.util.stream.Stream;

public class CollectR {
/*
 * Existen dos firmas:
 * 
 * <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R, R> combiner)
 * 
 * <R, A> R collect(Collector<? super T, A, R> collector)
 * 
 * */
	public static void main(String[] args) {
		/* <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R, R> combiner) */
		Stream<String> stream = Stream.of("w","o","l","f");
		StringBuilder word = stream.collect(
				StringBuilder::new									/*Almacena el resultado*/, 
				StringBuilder::append								/*Se encarga de ir agregando un nuevo elemento (recibe dos parametros y no regresa nada)*/,
				StringBuilder::append 								/*Se encarga en obtener una coleccion y hacer merge*/);
		System.out.println(word);
		
		System.out.println();
		Stream<String> stream2= Stream.of("w","o","l","f");
		TreeSet set = stream2.collect(
				TreeSet::new, 
				TreeSet::add,
				TreeSet::addAll);
		System.out.println(set);
		
		
	}

}
