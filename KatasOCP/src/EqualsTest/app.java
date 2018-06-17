package EqualsTest;

import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String args[]) {
		Objeto obj1 = new Objeto(1);
		
		Objeto obj2 = new Objeto(1);
		Objeto obj3 = new Objeto(11);
		Objeto obj4 = new Objeto(12);
		
		List<Objeto> lista = new ArrayList<>();
		lista.add(obj4);
		lista.add(obj3);
		lista.add(obj2);
		lista.add(obj1);
		
		for(Objeto obj:lista){
			System.out.println(obj.equals(obj1) + " " + obj.getId());
		}
	}
}
