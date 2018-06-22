package ImplementingUnaryBinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
 * UnaryOperator y BinaryOperator es un caso especial pues en todos los casos debe ser el mismo tipo
 * UnaryOperator Recibe un objeto de un cierto tipo y debe regresar un objeto de ese mismo tipo					-->		T apply(T t);
 * BinaryOperator Recibe dos objetos de un cierto tipo y debe regresar un objeto de ese mismo tipo				-->		T apply(T t1, T t2);
 * */
public class UnaryBinaryOperator {

	public static void main(String[] args) {
		/*Ver que a pesar que regresa un string no se pone en el operador diamante como en los Predicate*/
		UnaryOperator<String> u1 = String::toUpperCase;								/*UnaryOperator<String> u1 = x -> x.toUpperCase();*/
		System.out.println(u1.apply("chirp"));
		
		/*Ver que a pesar que regresa un string no se pone en el operador diamante como en los Predicate*/
		BinaryOperator<String> b1 = String::concat;									/*BinaryOperator<String> b1 = (string, toAdd) -> string.concat(toAdd);*/
		System.out.println(b1.apply("one", "two"));
	}

}
