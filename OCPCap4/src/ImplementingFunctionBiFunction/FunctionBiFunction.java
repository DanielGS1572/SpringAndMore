package ImplementingFunctionBiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * @FunctionalInterface
 * public class Function<T,R>{
 * 	R apply(T t);
 * }
 * 
 * @FunctionalIntrface public class BiFunction<T,U,R>{
 * 	R apply(T t,U u);
 * }
 * */
public class FunctionBiFunction {

	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;						/*Function<String, Integer> f1 = x -> x.length();*/
		System.out.println(f1.apply("cluck"));
		
		BiFunction<String,String,String> b1 = String::concat;				/*BiFunction<String,String,String> b1 = (string, toAdd) -> string.concat(toAdd);*/
		System.out.println(b1.apply("one", "two"));
	}

}
