package FunctionalInterface2;

import java.util.function.Predicate;

public class app {

	public static void main(String[] args) {
		System.out.println("checkTrait");
		checkTrait(new Animal("Fish",true, true), a-> a.isHop());		/*La a -> es por default
		un animal, pues la interfaz funcional es lo que recibe como parametro*/
		/* Aquí a-> a.isHop() ... es donde se define la interfaz funcional, recordar que la IF
		 * tiene muchos parametros opcionales, otra forma de verlo es que realmente esta 
		 * retornando a.isHop pues ... (Animal a) -> {return a.isHop;}
		 * 
		 * public boolean test(Animal animal) ... (Animal animal) = (Animal a) ... boolean = a.isHop
		 * 
		 *   Valid examples:
		 *   	() -> new Duck()	
				d -> {return d.quack();}
				(Duck d) -> d.quack()
				(Animal a, Duck d) -> d.quack()
				
				*/
		System.out.println("checkTrait2");
		checkTrait2(new Animal("Fish",true, true), a-> a.isHop());
	}
	private static void checkTrait(Animal animal, CheckTrait trait){
		if(trait.test(animal)){		/*Es como si se preguntara si el rasgo que se le pasa 
		como parámetro forma parte de animal*/
			System.out.println(animal.getSpecies());
		}
	}
//	Duck d -> d.quack()					// DOES NOT COMPILE
//	a,d -> d.quack()					// DOES NOT COMPILE
//	Animal a, Duck d -> d.quack()		// DOES NOT COMPILE	
//	(a, b) -> { int a = 0; return 5;}   // DOES NOT COMPILE	No se puede redeclarar la variable que se le pasa como parametro
	
	
	//En lugar de tener una interfaz funcional para cada tipo de objeto distinto a Animal se usa predicate
	//Cuya interfaz es muy similar a CheckTrait, pero con genericos
//					public interface Predicate<T> {
//						public boolean test(T t);
//					}
	
	private static void checkTrait2(Animal animal2, Predicate<Animal> predicate){
		System.out.println(predicate.test(animal2));
	}
	
}
