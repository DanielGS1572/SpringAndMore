package MapImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTreeMap {

	public static void main(String[] args) {
	Map<String,String> hash = new HashMap<>();
		
		hash.put("ocho", "ocho");
		hash.put("tres", "tres");
		hash.put("quince", "quince");
		
		for(String str: hash.values()) {
			System.out.println(str);
		}
		
		System.out.println();
		
	Map<String,String> tree = new TreeMap<>();

	tree.put("ocho", "ocho");
	tree.put("tres", "tres");
	tree.put("quince", "quince");
		
		for(String str: tree.values()) {
			System.out.println(str);
		}
	}

}
