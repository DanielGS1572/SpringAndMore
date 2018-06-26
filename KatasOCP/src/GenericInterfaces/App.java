package GenericInterfaces;

public class App {

	public static void main(String[] args) {
		Zebra z = new Zebra();
		Robot r = new Robot();
		
		
		ShippableAbstractCrate<Robot> sAC = new ShippableAbstractCrate<>();
		
		
		ShippableZebraCrate sRC = new ShippableZebraCrate();
		sRC.shipt(z);

	}

}
