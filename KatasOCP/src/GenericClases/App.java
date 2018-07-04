package GenericClases;

public class App {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> elCrate = new Crate<>();
		
		Zebra zebra = new Zebra();
		
		elCrate.addElement(elephant);
	}

}
