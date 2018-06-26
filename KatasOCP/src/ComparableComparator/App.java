package ComparableComparator;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Duck d1 = new Duck(4,"a");
		Duck d2 = new Duck(13,"b");
		Duck d3 = new Duck(5,"c");
		
		List<Duck> lista = new ArrayList<>();
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		Comparator<Duck> comp = new Comparator<Duck>() {

			@Override
			public int compare(Duck o1, Duck o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		Collections.sort(lista,comp);
		System.out.println(lista);
		

	}

}
