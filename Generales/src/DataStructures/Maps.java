package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Key value pair
public class Maps {
	public static void main(String args[]) {
		Map<String,List<String>> makeModel = new HashMap<>();
		
		List<String> hondaList = new ArrayList<>();
		hondaList.add("Civic");
		hondaList.add("Prelude");
		

		makeModel.put("Honda", hondaList);
		
		//Para revisar si tiene una llave
		System.out.println(
		makeModel.containsKey("Toyota"));
		
		System.out.println(makeModel.get("Honda"));
		System.out.println(makeModel.get("Toyota")); //No truena si no existe, simplemente manda nulo
	}
}
