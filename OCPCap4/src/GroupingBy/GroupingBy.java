package GroupingBy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

	public static void main(String[] args) {
		Stream<String> test1 = Stream.of("lions","tigers","bears","tigers");
		Map<Integer,List<String>> map1 = test1.collect(Collectors.groupingBy(String::length));		/*Para agrupar elementos comunes*/
		System.out.println(map1);
		
		
		
		Stream<String> test2 = Stream.of("lions","tigers","bears","tigers");
		Map<Integer,/*Set -->*/Set<String>> map2 = test2.collect(Collectors.groupingBy(String::length,/*Para Indicarle que el valor es un set -->*/Collectors.toSet()));		
		System.out.println(map2);
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length, /*Se le indica que sea un TreeMap --> */TreeMap::new, /*El valor lo pone como List -->*/Collectors.toList()));
		System.out.println(map);
		
	}

}
