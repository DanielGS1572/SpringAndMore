package BinarySearchExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(4,2,9,1);
		Collections.sort(lista);
		System.out.println(Collections.binarySearch(lista, 2));
	}
	

}
