package MethodReference.StaticMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceStatic {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>(Arrays.asList(3,1,2,4));
		System.out.println("lista sin ordenar");
		System.out.println(lista);
		
		/*Como regularmente se llama*/
//		Collections.sort(lista);
		/*Con static method reference*/
		Consumer<List<Integer>> methodRef1 = Collections::sort; //Toma un solo parametro de cualquier tipo (en este caso 
//		es la lista que esta en el operador diamante
		/*Con Lambda*/
//		Consumer<List<Integer>> lambda = l -> Collections.sort(l);
		System.out.println();
		System.out.println("lista ordenada");
		System.out.println(lista);
	}

}
