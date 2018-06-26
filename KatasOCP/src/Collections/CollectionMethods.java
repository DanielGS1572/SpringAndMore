package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMethods {
		
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>(Arrays.asList(4,2,4,3,10));
			System.out.println(list);
			list.remove(new Integer(4));
			System.out.println(list);
			System.out.println(list.isEmpty());
			System.out.println(list.contains(new Integer(4)));
			System.out.println(list.size());
		}
}
