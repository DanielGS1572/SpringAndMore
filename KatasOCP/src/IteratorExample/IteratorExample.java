package IteratorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
		lista1.add("1");
		lista1.add("2");
		lista1.add("3");
		
		
		Iterator it = lista1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
