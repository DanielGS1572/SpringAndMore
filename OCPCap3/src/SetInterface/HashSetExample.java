package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
/*El hashset no mantiene el orden de los elementos, el treeset si lo mantiene*/
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(66);
		set.add(10);
		set.add(66);
		set.add(8);
		for(Integer s: set) System.out.println(s);
	}

}
