package BinarySearchExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,4,10,22,3);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 3));
		System.out.println(Collections.binarySearch(list, 2));
	}

}
