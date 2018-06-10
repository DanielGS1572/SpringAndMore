package InstanceOf.Clase;

public class App {

	public static void main(String[] args) {
		HeavyAnimal hipoHA = new Hipo();
		HeavyAnimal elephant = new Elephant();
		
		Hipo hipo = new Hipo();
		
		System.out.println(hipoHA instanceof HeavyAnimal);
		System.out.println(elephant instanceof HeavyAnimal);
		
		System.out.println(hipoHA instanceof Elephant);
		
		System.out.println(hipo instanceof HeavyAnimal);
		
		
		
		

	}

}
