package MethodReference;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MR1ReferenceExample {

	public static void main(String[] args) {
		/*Expresión lambda*/
		Stream.of(3,1,4,1,5,9).forEach(x -> System.out.print(x)); 														System.out.println();
		/*Method Reference*/
		Stream.of(3,1,4,1,5,9).forEach(System.out::print);																System.out.println();
		
		/*Asignando un method reference a un interfaz funcional*/
		Consumer<Integer> printer = System.out::print;
		Stream.of(3,1,4,1,5,9).forEach(printer);																		System.out.println();
		
		Stream.generate(Math::random).limit(5).forEach(System.out::println);;		/*El generate recibe como parametro un supplier Funcion que no recibe nada pero regresa algo, se
		usa un method reference de un metodo static*/
	}

}
