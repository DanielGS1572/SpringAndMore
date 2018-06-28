package GenericBounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
	public static void test(List<? extends Number> lista){
		
	}
	public static void test2(List<String> unbounded){
		
	}
	public static void main(String ... args){
		List<Integer> lista = new ArrayList<>();
		test(lista);
	}
}
