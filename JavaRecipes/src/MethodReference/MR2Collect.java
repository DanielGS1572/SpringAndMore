package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MR2Collect {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("this","is","a","list");
		List<String> sorted1 = strings.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());		/*Como sorted regresa un stream es necesario hacer un collect*/
		List<String> sorted2 = strings.stream().sorted(String::compareTo).collect(Collectors.toList());					/*.sorted recibe un comparator por lo que ya se encarga de pasarle los parametros como van*/
	}

}
