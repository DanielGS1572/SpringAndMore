package MethodReference.MethodReferenceRuntimeInstance;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceRuntimeInstance {

	public static void main(String[] args) {
		Predicate<String> x = String::isEmpty;
		Predicate<String> y = s -> s.isEmpty();
		
	}

}
