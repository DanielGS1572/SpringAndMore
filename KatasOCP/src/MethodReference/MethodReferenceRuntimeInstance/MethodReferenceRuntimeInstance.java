package MethodReference.MethodReferenceRuntimeInstance;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceRuntimeInstance {

	public static void main(String[] args) {
		Predicate<String> s = String::isEmpty;
		System.out.println(s.test("a"));
	}

}
