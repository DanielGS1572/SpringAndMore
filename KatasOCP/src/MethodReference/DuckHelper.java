package MethodReference;

import java.util.Comparator;

public class DuckHelper {
	public static int compareAge(Duck d1, Duck d2) {
		return d1.getAge() - d2.getAge();
	}
	public static void main(String[] args) {
		Comparator<Duck> comp = DuckHelper::compareAge;

	}

}
