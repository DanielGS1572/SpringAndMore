package InstanceOf.Clase;

public class App {

	public static void main(String[] args) {
		HeavyAnimal hipoHeavy = new Hipo();
		HeavyAnimal elHeavy = new Elephant();
		
		Hipo hipo = new Hipo();
		Elephant ele = new Elephant();
		
		System.out.println(elHeavy instanceof Hipo);
		System.out.println(hipoHeavy instanceof Elephant);
		System.out.println(ele instanceof Elephant);
//		System.out.println(ele instanceof Hipo);
		

	}

}
