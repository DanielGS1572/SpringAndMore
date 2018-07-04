package GenericInterfaces;

public class App {

	public static void main(String[] args) {
		Zebra zebra = new Zebra();
		Robot robot = new Robot();
		
		ShippableAbstractCrate<Robot> sACRobot = new ShippableAbstractCrate<>();
		sACRobot.ship(robot);
		
		ShippableZebraCrate<Zebra> sZC = new ShippableZebraCrate<>();
		sZC.ship(zebra);
	}

}
