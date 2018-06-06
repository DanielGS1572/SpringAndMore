package SetInterface;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
/*El treeset mantiene el orden y ademas por ser un set, no acepta duplicados*/
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();		/*Integers implementan la interfaz comparable*/
		set.add(66);
		set.add(10);
		set.add(66);
		set.add(8);
		for(Integer s: set) System.out.println(s);
		
		/*El treeset implementa una interfaz que se llama NavigableSet he implementa los siguientes metodos*/
		NavigableSet<Integer> set2 = new TreeSet<>();	
		for(int i=1; i<= 20; i=i+2) set2.add(i);
		print(set2.lower(5));		// < e
		print(set2.higher(19));		// > e
		print(set2.ceiling(5));		// >= e
		print(set2.floor(8));		// <= e
		
		/*Si no encuentra algun resultado manda nulo*/
	}
		static void print(Integer i){
			System.out.println(i);
		}
}
