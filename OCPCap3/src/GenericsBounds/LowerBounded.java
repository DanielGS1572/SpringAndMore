package GenericsBounds;

import java.util.ArrayList;
import java.util.List;

/*Lower Bounded usa la palabra super y significa que acepta el tipo de objeto que se indica
 * y ademas el objeto que es su super clase, por ejemplo (String y Object [superclase])*/
public class LowerBounded {
	public static void main(String args[]){
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		
		List<Object> objects = new ArrayList<Object>(strings);			
/*Ver que en el constructor del arraylist se le puede pasar una lista del tipo List<String> pues String
 * extiende de Ojbect*/
		addSound(strings);
		addSound(objects);
		for(Object valor:objects){
			System.out.println(valor.getClass() + " " + valor);
		}
	}
	
	public static void addSound(List<? super String> list){	/*Lower bound -> es mas especifico String que 
	Object, por eso "lower bound"*/
		list.add("quack");
	}

}
