package MethodReference.StaticMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceStatic {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(4,5,2,8);
		System.out.println(lista);
		
		Consumer<List<Integer>> listOrder = Collections::sort;
		listOrder.accept(lista);
		System.out.println(lista);
		
		List<Integer> lista2 = Arrays.asList(4,5,2,8);
		Consumer<List<Integer>> ord = l -> Collections.sort(l);
		ord.accept(lista2);
		System.out.println(lista2);
	
	
	}
	

}
