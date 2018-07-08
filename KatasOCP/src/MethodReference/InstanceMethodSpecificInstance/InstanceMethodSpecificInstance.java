package MethodReference.InstanceMethodSpecificInstance;

import java.util.function.Predicate;

public class InstanceMethodSpecificInstance {

	public static void main(String[] args) {
		String test = "x";
		Predicate<String> p = test::startsWith;
		System.out.println(p.test("x"));
		
		Predicate<String> q = s -> s.startsWith("x");
		System.out.println(q.test("a"));
		
}

}
