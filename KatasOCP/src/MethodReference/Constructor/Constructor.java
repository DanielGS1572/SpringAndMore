package MethodReference.Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Constructor {

	public static void main(String[] args) {
		Supplier<ArrayList<String>> cons1 = ArrayList<String>::new;
		Supplier<ArrayList<Object>> lambda = ()-> new ArrayList<>();
		
	}

}
