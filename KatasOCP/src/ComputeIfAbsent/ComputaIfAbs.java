package ComputeIfAbsent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputaIfAbs {

	public static void main(String[] args) {
		Map<String,String> mapa = new HashMap<>();
		mapa.put("y1", "v1");
		mapa.put("y2", "v2");
		mapa.put("y3", null);
		
		Function<String,String> function = (x) -> x + " ok ";
		
		mapa.computeIfAbsent("y3", function);
		System.out.println(mapa);
	}

}
