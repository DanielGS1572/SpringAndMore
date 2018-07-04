package GenericBounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBound {
	public static void test(List<? super String> lista) {
		
	}
	
	public static void main(String [] args) {
		List<Object> lista = new ArrayList<>();
		test(lista);
	}

}
