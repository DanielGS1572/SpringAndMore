package GenericInterfaces;


/*Una de las formas de implementar la interfaz es explicitamente diciendole
 * el tipo de objeto que recibirá la interfaz Generica*/
public class ShippableRobotCrate implements Shippable<Zebra> {

	@Override
	public void ship(Zebra t) {
			
	}
	
}
