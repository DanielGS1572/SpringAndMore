package MethodReference.InstanceMethodSpecificInstance;

import java.util.function.Predicate;

public class InstanceMethodSpecificInstance {

	public static void main(String[] args) {
		String str = "abc";
		/*Ejemplo con method reference*/
		/*Predicate .- Toma un solo parametro de cualquier tipo y regresa un boolean*/
		Predicate<String> methodRef2 = str::startsWith;			/*Ver que se le pasa la instancia directamente como tal*/
		/*Ejemplo con lambda*/
		Predicate<String> lambda = s -> str.startsWith(s);
	}

}
