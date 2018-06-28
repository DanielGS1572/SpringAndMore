package GenericBounds;

import java.util.Arrays;
import java.util.List;

public class LowerBound {
	public static void test(List<? super String> lista){
		
	}
	public static void main(String[] args) {
		List<Object> lista = Arrays.asList(new Object(),new Object());
		test(lista);

	}

}
