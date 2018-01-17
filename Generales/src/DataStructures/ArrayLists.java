package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String args[]) {

		List<String> arrayList = new ArrayList();
		arrayList.add("test");
		arrayList.remove(2);	// --> manda excepcion tambien si no existe el elemento
		
		//Como regla... no se pueden agregar datos primitivos en un List. Pero si se puede poner su wrapper
//		List<char> arrayList1 = new ArrayList();
		List<Character> arrayList2 = new ArrayList();
		arrayList2.add('a');
			
	}
}
