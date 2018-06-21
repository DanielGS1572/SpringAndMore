package BinarySearchExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(10,13,4,20,8,2,8);
		Collections.sort(lista);
		System.out.println(lista);
		
		System.out.println(Collections.binarySearch(lista, 8));
		System.out.println(Collections.binarySearch(lista, 1));
		System.out.println(Collections.binarySearch(lista, 4));
	}

}
