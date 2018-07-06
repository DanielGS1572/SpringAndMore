package MapImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTreeMap {

	public static void main(String[] args) {
	Map<Integer,String> hash = new HashMap<>();
	
	hash.put(333, "3");
	hash.put(1, "1");
	hash.put(4, "4");
	
	System.out.println(hash);
	
	Map<Integer,String> tree = new TreeMap<>();
	
	tree.put(333, "3");
	tree.put(1, "1");
	tree.put(4, "4");
	
	System.out.println(tree);
	}
	

}
