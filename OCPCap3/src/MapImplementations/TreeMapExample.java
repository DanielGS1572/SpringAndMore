package MapImplementations;

import java.util.Map;
import java.util.TreeMap;

/*El TreeMap ordena los valores*/
public class TreeMapExample {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<>();
		map.put("koala","bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		System.out.println(map.get("koala"));
		System.out.println("\n");
		
		for(String key: map.keySet()){
			System.out.println(key);
		}
		

	}

}
