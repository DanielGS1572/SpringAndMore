package Generics;

public class App {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Zebra zebra = new Zebra();
		
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant elephantDischarged = crateForElephant.emptyCrate();
		
		Crate<Zebra> crateForZebra = new Crate<>();
		crateForZebra.packCrate(zebra);
		Elephant zebraDischarged = crateForElephant.emptyCrate();
	}

}
