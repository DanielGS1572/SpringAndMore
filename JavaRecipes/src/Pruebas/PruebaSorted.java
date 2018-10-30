package Pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaSorted {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("B","a","C");
		
		List<String> orden1 = lista.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(orden1);
		
		List<String> orden2 = lista.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(orden2);
	} 

}
