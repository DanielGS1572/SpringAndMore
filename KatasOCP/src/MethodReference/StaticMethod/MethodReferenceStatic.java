package MethodReference.StaticMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceStatic {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(3,2,9);
		
		System.out.println("sin ordenar");
		System.out.println(lista);
		
		Consumer<List<Integer>> cons = Collections::sort;
		
		cons.accept(lista);
		System.out.println(lista);
	}

}
