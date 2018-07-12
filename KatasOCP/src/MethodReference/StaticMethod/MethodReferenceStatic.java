package MethodReference.StaticMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceStatic {
	
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("b","a","z","e");
		Consumer<List<String>> consumer = Collections::sort;
		consumer.accept(lista);
		System.out.println(lista);
		
		
		List<String> list = Arrays.asList("b","a","z","e");
		Consumer<List<String>> c = l -> Collections.sort(list);
		c.accept(list);
		System.out.println(list);
	}
	

}
