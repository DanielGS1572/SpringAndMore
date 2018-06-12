package InstanceOf.Clase;

public class App {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Hipo hipo = new Hipo();
		
		HeavyAnimal heavyHipo = new Hipo();
		HeavyAnimal heavyElephant = new Elephant();
		
		System.out.println(hipo instanceof HeavyAnimal);
//		System.out.println(hipo instanceof Elephant);
		
		
		
		

	}

}
