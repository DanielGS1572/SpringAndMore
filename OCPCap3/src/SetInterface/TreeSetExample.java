package SetInterface;

import java.util.HashSet;
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
	}

}
