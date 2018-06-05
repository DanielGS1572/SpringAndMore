package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
//		Hay dos formas de usar el iterator (la version antigua java 5)
//		o la version "acutal" con genericos que en teoria ya no debe usarse
		
		List<String> lista1 = new ArrayList(Arrays.asList("elemento1","elemento2","elemento3"));
		List<String> lista2 = new ArrayList(Arrays.asList("elementoA","elementoB","elementoC"));
		
		Iterator iter1 = lista1.iterator();		/*ver como Iterator es una interfaz y se usa el 
		 										metodo iterator() de la lista*/
		while(iter1.hasNext()){
			String string = (String)iter1.next();		/*Se debe hacer un casteo*/
			System.out.println(string);
		}
		System.out.println("\n");
		
		Iterator<String> iter2 = lista2.iterator();
		while(iter2.hasNext()){
			String string = iter2.next();				/*Ya no se debe hacer casteo por el generico de la interfaz Iterator*/
			System.out.println(string);
		}
		
		

	}

}
