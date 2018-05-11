package InstanceOf.Clase;

public class App {

	
	public static void main(String args[]) {
		HeavyAnimal hippoHeavyAnimal = new Hippo();
		HeavyAnimal elephantHeavyAnimal = new Elephant();
		
		Hippo hippo = new Hippo();
		
		
		
		System.out.println(hippoHeavyAnimal instanceof Hippo);
		System.out.println(hippoHeavyAnimal instanceof Elephant);
		
		/*La siguiente linea manda error pues la referencia apunta directamente a Hippo y no a HeavyAnimal*/
//		System.out.println(hippo instanceof Elephant);
		
		Elephant elephantNull = null;
		System.out.println(elephantNull instanceof Elephant);		/*Los nulos no heredan de Object por lo que cualquier cosa
		 															nula instanceof CLASE siempre mandará falso*/
	}
}
