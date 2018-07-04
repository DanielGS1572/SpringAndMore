package GenericBounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
	public static void test(List<? extends Number> lista) {
		
	}
	
	public static void main(String[] args) {
		Integer obj1 = new Integer(2);

		List<Integer> lista = new ArrayList<>();
		lista.add(obj1);
		test(lista);
		
	}
}
