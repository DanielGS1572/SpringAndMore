package MethodReference.Constructor;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Constructor {

	public static void main(String[] args) {

		Supplier<ArrayList> methodRef2 = ArrayList::new;
		Supplier<ArrayList> lambda2 = () -> new ArrayList();
	}

}
