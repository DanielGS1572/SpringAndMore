package ImmutableObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class App {
	private static List lista = new ArrayList<String>();
	private static List lista2 = new ArrayList<String>();
	public static void main(String[] args) {
		
		/*Descomentar el codigo y comentar la otra sección para ver que si no se hace un new ArrayList
		 * en el constructor se vuelve mutable*/
//		lista.add("uno");
//		lista.add("dos");
//		lista.add("tres");
//		Animal animal = new Animal(lista);
//		lista.add("cuatro");
//		
//		System.out.println(animal.getList());		
		
		lista2.add("uno");
		lista2.add("dos");
		lista2.add("tres");
		Animal animal2 = new Animal(4,lista2);
		lista2.add("cuatro");
		System.out.println(animal2.getList());		/*Aqui se vuelve inmutable porque en el constructor
		 											se le pasa una copia*/
	}

}
