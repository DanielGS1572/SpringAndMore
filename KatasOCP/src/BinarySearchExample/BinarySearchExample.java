package BinarySearchExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(83,15,19,40);
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(Collections.binarySearch(lista, 19));
	
	}
	

}
