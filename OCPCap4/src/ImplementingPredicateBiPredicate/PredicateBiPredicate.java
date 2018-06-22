package ImplementingPredicateBiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;


/*@FunctionalInterface
 * public class Predicate<T>{
 * 	boolean test(T t);
 * }
 * 
 * public class BiPredicate<T,U>{
 * 	boolean test(T t, U u);
 * }
 * */


/*Predicate y BiPredicate se usan regularmente para filtrado o hacer matching*/
public class PredicateBiPredicate {

	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;						/* ---->> Predicate<String> p1 = x -> x.isEmpty()*/
		System.out.println(p1.test(""));
		
																	/*Cómo sabe como acomodar los dos parametros?  -->   startsWith es un metodo de instancia por lo que el primer
																	 * argumento lo pone como referencia y el segundo parametro lo pone como argumento*/
		BiPredicate<String, String> b1 = String::startsWith;		/* ---->> BiPredicate<String, String> b1 = (string,prefix) -> string.startsWith(prefix)*/
		
		
		/*Una interfaz funcional puede tener metodos default que pueden ser usados, ver la pagina de dudaBiPredicate*/
		

	}

}
