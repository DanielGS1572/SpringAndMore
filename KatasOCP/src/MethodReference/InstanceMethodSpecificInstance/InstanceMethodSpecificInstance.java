package MethodReference.InstanceMethodSpecificInstance;

import java.util.function.Predicate;

public class InstanceMethodSpecificInstance {

	public static void main(String[] args) {
		String x = "abc";
		Predicate<String> pred = x::startsWith;
		Predicate<String> pred2 = s -> x.startsWith(s);
	}

}
