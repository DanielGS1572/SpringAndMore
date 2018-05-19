package FunctionalInterface2;

public class app {

	public static void main(String[] args) {
		checkTrait(new Animal("Fish",true, true), a-> a.isHop());		/*La a -> es por default
		un animal, pues la interfaz funcional es lo que recibe como parametro*/
	}
	private static void checkTrait(Animal animal, CheckTrait trait){
	if(trait.test(animal)){		/*Es como si se preguntara si el rasgo que se le pasa 
	como parámetro forma parte de animal*/
		System.out.println(animal.getSpecies());
	}
	}
}
