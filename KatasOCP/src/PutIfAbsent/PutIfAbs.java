package PutIfAbsent;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbs {

	public static void main(String[] args) {
		Map<String,String> mapa = new HashMap<>();
		mapa.put("y1", "v1");
		mapa.put("y2", "v2");
		mapa.put("y3", null);
		System.out.println(mapa);
		System.out.println();
		mapa.putIfAbsent("y1", "pendiente");
		mapa.putIfAbsent("y2", "pendiente");
		mapa.putIfAbsent("y3", "pendiente");
		System.out.println(mapa);
	}

}
