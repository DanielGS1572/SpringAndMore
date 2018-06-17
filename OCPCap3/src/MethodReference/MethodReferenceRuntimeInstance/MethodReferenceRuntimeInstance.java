package MethodReference.MethodReferenceRuntimeInstance;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceRuntimeInstance {

	public static void main(String[] args) {
		Predicate<String> methodRef1 = String::isEmpty;		/*Pareciera que se esta mandando llamar 
		un metodo estatico de String pero no es asi.*/
		Predicate<String> lambda1 = s -> s.isEmpty();
		
		
	}

}
