package MethodReference;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MR1ReferenceExample {

	public static void main(String[] args) {
		/*Expresión lambda*/
		Stream.of(3,1,4,1,5,9).forEach(x -> System.out.print(x)); 														System.out.println();
		/*Method Reference*/
		Stream.of(3,1,4,1,5,9).forEach(System.out::print);																System.out.println();
		
		/*Asignando un method reference a un interfaz funcional
		* Ver que el method reference toma del contexto el tipo de dato y el dato ya que si no se definiera printer la sentencia sería simplemente Stream.of(3,1,4,1,5,9).forEach(System.out::print)*/
		Consumer<Integer> printer = System.out::print;
		Stream.of(3,1,4,1,5,9).forEach(printer);																		System.out.println();

		Supplier<Double> supplier = Math::random;
		Consumer<Double> consumer = System.out::println;
		Stream.generate(supplier).limit(5).forEach(consumer);;		/*El generate recibe como parametro un supplier Funcion que no recibe nada pero regresa algo, se
		usa un method reference de un metodo static*/
		/*Hay tres formas de usar method references
		* 		- object::instanceMethod --> System.out::println
		* 		- Class::staticMethod 	 --> Math::max
		* 		- Class::instanceMethod	 --> String::length 	--> se usa como objetivo, no como argumento, por ejemplo x.length()*/
		/*Ver que Strem.of se le estan pasando los numero como tal y Stream.generate los genera a partir de una función supplier*/
		
		Function<String,Integer> cons = String::length;
		Stream.of("abc","bd","c").map(cons).forEach(printer);							/*como el lenght() se usa valor.length() no recibe ningun argumento por eso se usa String::length*/
		Stream.of("abc","bd","c").map(String::length).forEach(printer);	
		
		
		System.out.println();
		System.out.println("valor".length());
		
	}

}
